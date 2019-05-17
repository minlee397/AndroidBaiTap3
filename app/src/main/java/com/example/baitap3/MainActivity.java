package com.example.baitap3;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String app_name = "";
    List<Category> categories;
    ListView list_item;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app_name ="  Food.com Recipes " +  DateFormat.getDateInstance(DateFormat.FULL,  Locale.US).format(new Date());
        getSupportActionBar().setTitle(app_name);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_food);
        categories = new ArrayList<Category>();
        list_item = (ListView)findViewById(R.id.list_recipes);

        //new ReadRss().execute("https://www.geniuskitchen.com/rss");
        new ReadRss().execute("https://www.homecookingadventure.com/rss");
    }

    private List<Category> InitializationData(){
        RawData data = new RawData();
        List<Category> c = new ArrayList<Category>();
        c = data.getCategories();
        return c;
    }

    public class ReadRss extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... strings) {
            StringBuilder content = new StringBuilder();
            try {
                URL url = new URL (strings[0]);
                InputStreamReader inputStreamReader = new InputStreamReader(url.openConnection().getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    content.append(line);
                }
                bufferedReader.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            XMLDOMParser parser = new XMLDOMParser();
            Document document = parser.getDocument(s);

            // GetData From Rss
            List<Dish> dishs = new ArrayList<Dish>();
            NodeList nodeChannel = document.getElementsByTagName("channel");
            Element element = (Element) nodeChannel.item(0);
            categories.add(new Category(1,parser.getValue(element,"title"),dishs));


            // Set Data to ListView
            List<String> categories_name = new ArrayList<String>();
            for(int i=0; i<categories.size(); i++)
                categories_name.add(categories.get(i).getCategoryName());
            list_item = (ListView)findViewById(R.id.list_recipes);
            adapter = new ArrayAdapter<String>(getApplication(), android.R.layout.simple_list_item_1,categories_name);
            list_item.setAdapter(adapter);

            list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = new Intent(MainActivity.this,OptionsActivity.class);
                    i.putExtra("recipes_id",String.valueOf(position));
                    startActivity(i);
                }
            });
        }
    }
}
