package com.example.baitap3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RawData {
    private List<Category> Categories;
    /*public RawData(){
        List<Category> categories= new ArrayList<Category>();
        List<Dish> dishs;

        //Chicken Recipes
        dishs = new ArrayList<Dish>();
        dishs.add(new Dish(1,"Chicken Paprikash Casserole","Chicken paprikash, a traditional Hungarian recipe, gets the casserole treatment in this flavorful dish. Chicken is combined with red bell peppers, Hungarian paprika and sour cream, then tossed with egg noodles to create a modern take on an old-school classic.",R.drawable.dish_1,"https://www.bettycrocker.com/recipes/chicken-paprikash-casserole/50c4c207-30dc-4d20-ab82-5e9ce5c7f908",3));
        dishs.add(new Dish(2,"Chicken Parmesan Skillet Casserole","This hearty skillet dinner is an easy, deconstructed version of chicken Parmesan that makes the classic achievable, even on the most rushed weeknight. Still cheesy, still crunchy, still saucy—just easier to assemble and made right on the stovetop!",R.drawable.dish_2,"https://www.bettycrocker.com/recipes/chicken-parmesan-skillet-casserole/60f9b18d-261e-4caa-8b70-e37f590144cb",5));
        dishs.add(new Dish(3,"Make-Ahead Cheesy Southwest Chicken and Pasta Casserole","Plan ahead and put this party-ready casserole in the freezer for your next big get-together! Once it’s thawed, top with tortilla chips, and bake for a cheesy-crunchy crowd pleaser that packs tons of flavor and just the right amount of heat.",R.drawable.dish_3,"https://www.bettycrocker.com/recipes/make-ahead-cheesy-southwest-chicken-and-pasta-casserole/8cfd4dc5-9251-437b-9b29-f86d440bec9d",4));
        dishs.add(new Dish(4,"Classic Chicken Pot Pie","Tell everyone you’re having pie for dinner and see how big their smiles are. This homemade chicken pot pie recipe streamlines your work by using frozen peas and carrots and Pillsbury refrigerated pie crusts. Swap out different proteins and vegetables to put your own unique spin on this old-fashioned favorite",R.drawable.dish_4,"https://www.bettycrocker.com/recipes/classic-chicken-pot-pie/60237278-5f5b-4658-a583-8d085fea6dba",5));
        dishs.add(new Dish(5,"Quesadilla Chicken Pot Pie","Take homemade chicken pot pie to the next level with this quesadilla inspired twist! Did we mention it’s easy enough to make on a weeknight?",R.drawable.dish_5,"https://www.bettycrocker.com/recipes/quesadilla-chicken-pot-pie/1e74bed4-6219-48dd-928c-4b6c9599a25b",3));
        categories.add(new Category(1,"Chicken Recipes",dishs));

        //Apple Recipes
        dishs = new ArrayList<Dish>();
        dishs.add(new Dish(1,"Apple Crisp with Oats","Making scratch-made apple crisp is easier than you think with this easy recipe. Chunks of apple get tossed with cinnamon, sugar and a little flour to help create the right texture, then topped with a simple streusel mixture. Simply bake until golden on top and bubbly inside. It’s a perfect recipe for new and experienced bakers alike, and a delicious way to celebrate fall.",R.drawable.dish_6,"https://www.bettycrocker.com/recipes/apple-crisp-with-oats/434c1c4e-613b-4b0b-9453-3f3ed5c479a8",1));
        dishs.add(new Dish(2,"Apple Cider Doughnut Cake","Nothing says “fall” quite like an apple cider doughnut, and with this easy bundt, you get a crowd-friendly version of everyone’s favorite seasonal treat. The yellow cake batter gets an apple infusion with cider and shredded apples before being baked and finished with a double sprinkle of cinnamon sugar",R.drawable.dish_7,"https://www.bettycrocker.com/recipes/apple-cider-doughnut-cake/7d9dadd5-834d-469e-9485-3356d8f028c4",3));
        dishs.add(new Dish(3,"Easy Apple Pie Cookie Cups","These adorable cookie cups are easy as pie—actually, they’re easier! Betty Crocker™ sugar cookie mix and spiced pie filling provide a shortcut start to these irresistible apple treats that are perfect for fall.",R.drawable.dish_8,"https://www.bettycrocker.com/recipes/easy-apple-pie-cookie-cups/2b2b7594-c7e1-4bb3-8e47-08a2e792797b",1));
        dishs.add(new Dish(4,"Cinnamon Roll Apple Roses","Edible roses made with tart apple slices wrapped up in sweet and gooey cinnamon rolls. Such an easy and impressive treat!",R.drawable.dish_9,"https://www.bettycrocker.com/recipes/cinnamon-roll-apple-roses/1ee28fba-8547-4615-9074-afc975c39ba7",0));
        dishs.add(new Dish(5,"Cinnamon Apple Monkey Bread","We are loving this twist on a classic recipe, Monkey Bread! Replace biscuits with cinnamon rolls and you have a whole new flavor dimension. This recipe combines apples, fall spices, and sweet cinnamon rolls to create a warm and beautiful dish you can serve to your family and guests!",R.drawable.dish_10,"https://www.bettycrocker.com/recipes/cinnamon-apple-monkey-bread/34857a84-c656-4a37-aba5-837f4a428bb3",5));
        categories.add(new Category(2,"Apple Recipes",dishs));

        //Turkey Recipes
        dishs = new ArrayList<Dish>();
        dishs.add(new Dish(1,"Impossibly Easy Mushroom-Swiss Turkey Burger Pie","Fix up family dinner in 40 minutes with this Impossibly Easy pie recipe featuring one of our favorite better-together flavor combos: mushrooms and Swiss cheese. This meal in a pie plate takes inspiration from the beloved Impossibly Easy Cheeseburger Pie.",R.drawable.dish_11,"https://www.bettycrocker.com/recipes/impossibly-easy-mushroom-swiss-turkey-burger-pie/c501a22e-ff7e-4c10-961a-fa3f48cc8305",5));
        dishs.add(new Dish(2,"Turkey Chili with Squash","Craving a hearty, meaty chili that’ll feed the whole family while keeping calories in check? This one-pot recipe ticks all the boxes! With the extra-lean turkey, poblano chiles and winter squash, this chili has some “super” ingredients, which meld perfectly with the warming chili spices, tomatoes and beans",R.drawable.dish_12,"https://www.bettycrocker.com/recipes/turkey-chili-with-squash/0bdcd0db-da53-4065-abfb-4ad73234bcc4",4));
        dishs.add(new Dish(3,"Turkey and Swiss Biscuit Sliders","Feed your crowd with tasty biscuit sliders that deliver on favorite seasonal flavors and make the perfect use for leftover Thanksgiving turkey (and cranberry sauce!).",13,"https://www.bettycrocker.com/recipes/turkey-and-swiss-biscuit-sliders/54cb44c1-9773-4b95-9654-0acf5b6621b5",4));
        dishs.add(new Dish(4,"Dry-Brined Turkey Breast with Gravy","After trying this dry-brining method, you’ll never prepare turkey breast any other way. The secret to the method is skipping the liquid in favor of seasonings and salt, which make this centerpiece dish incredibly tender, juicy and flavorful. Making gravy in the same skillet where you sear the turkey breast guarantees an equally delicious final touch!",R.drawable.dish_14,"https://www.bettycrocker.com/recipes/dry-brined-turkey-breast-with-gravy/c24c8154-b2b9-4bf3-96e5-b604d7ff63a7",2));
        dishs.add(new Dish(5,"Turkey-Parmesan Cheese Balls","Meet your next favorite party food! This turkey Parm-inspired spin on classic Bisquick™ Cheese Balls is every bit as easy and quick to make as the original. Packed with Italian seasoning, Parmesan and garlic, they’re guaranteed to disappear before the party ends.",R.drawable.dish_15,"https://www.bettycrocker.com/recipes/turkey-parmesan-cheese-balls/8f5cd9e5-9bc0-4154-b26a-daa6db451f93",5));
        categories.add(new Category(3,"Turkey Recipes",dishs));

        //Vegetable Recipes
        dishs = new ArrayList<Dish>();
        dishs.add(new Dish(1,"Carrot Cake Rolls","Need an extra-special dessert for your spring party? These Carrot Cake Rolls are a stunning addition to any dessert table. Made easy with Betty Crocker™ Super Moist™ yellow cake mix, cinnamon, nutmeg and shredded carrots are added in before baking for the perfect carrot...",R.drawable.dish_16,"https://www.bettycrocker.com/recipes/carrot-cake-rolls/e07bba7e-d59d-46c7-abf1-c9840f0e1004",4));
        dishs.add(new Dish(2,"Carrot Top PEEPS® Bunny Cake","This fun and festive springtime dessert gives a whole new meaning to \"carrot cake\"! A cupcake frosted to look like a carrot top sits atop this two-tiered carrot cake covered in rich cream cheese frosting. It's decorated with adorable PEEPS® bunnies for an extra-sweet an...",R.drawable.dish_17,"https://www.bettycrocker.com/recipes/carrot-top-peeps-bunny-cake/1c95efb4-964a-4f9c-b501-c57ea763db73",5));
        dishs.add(new Dish(3,"Make-Ahead Sausage and Mushroom Savory Bread Pudding","Call it a strata, a stuffing, a dressing or a savory bread pudding—by any name, this dish is delish! It’s the perfect make-ahead for a special brunch, or serve it with a side salad for dinner; either way, it’s certainly nice enough for company. But what’s even nicer is ...",R.drawable.dish_18,"https://www.bettycrocker.com/recipes/make-ahead-sausage-and-mushroom-savory-bread-pudding/3131ebdc-e50a-49a2-ba66-c2f2c3652a44",3));
        dishs.add(new Dish(4,"Bacon-Wrapped Asparagus","While asparagus season is here, keep this recipe near. It’s a pretty and impressive side perfect for brunch or dinner—maybe alongside a steak! And it’s a godsend when entertaining, since it’s made with only five ingredients, a single pan and the simplest of techniques. ...",R.drawable.dish_19,"https://www.bettycrocker.com/recipes/bacon-wrapped-asparagus/56ebbc6e-c9e9-498a-ad68-71f9c422fb27",4));
        dishs.add(new Dish(5,"Sheet-Pan Salmon Niçoise","No need to wait for warm weather to enjoy the flavors of this classic French salad—this sheet-pan recipe transforms it into a low-fuss, impressive dinner. With the roasted green beans, tomatoes and potatoes, this meal is still largely vegetable-based, just like the orig...",R.drawable.dish_20,"https://www.bettycrocker.com/recipes/sheet-pan-salmon-nicoise/0471bd57-c093-4e26-b9e0-160502a06d58",3));
        categories.add(new Category(4,"Vegetable Recipes",dishs));

        //Beef Recipes
        dishs = new ArrayList<Dish>();
        dishs.add(new Dish(1,"Fajita-Stuffed Spaghetti Squash","When you need a seriously satisfying dinner—something rich, meaty and cheesy—but don’t want to be weighed down, turn to this recipe. Baking your fajita fixings in a spaghetti squash allows the flavors to shine through, so you’ll be enjoying the beef, onions, peppers and...",21,"https://www.bettycrocker.com/recipes/fajita-stuffed-spaghetti-squash/5c0ac754-e3cf-401d-a70b-56b20e225397",3));
        dishs.add(new Dish(2,"Greek Meatballs and Rice Skillet","Some of the key flavors of Greek cuisine—mint, parsley, feta, garlic, lemon—infuse this simple skillet meal that delivers big flavors without going overboard on calories. A one-pot meal that cooks up in about an hour, it’s made from a base of basic ingredients, like ric...",22,"https://www.bettycrocker.com/recipes/greek-meatballs-and-rice-skillet/6d930ccd-6bde-479f-8cac-23dd1976fc9a",5));
        dishs.add(new Dish(3,"Zucchini and Ground Beef Orzo Casserole","Ground beef and zucchini make a great pairing is this surprisingly light casserole. There’s enough creamy cheese and orzo pasta to make this taste indulgent, but the zucchini plays a role too, as it has a naturally buttery taste and silky texture, both of which are enha...",23,"https://www.bettycrocker.com/recipes/zucchini-and-ground-beef-orzo-casserole/938f4b75-e3dc-425b-a386-2b44a036a7d3",4));
        dishs.add(new Dish(4,"Beef Wellingtons (Cooking for 2)","Make an impressive dinner worthy of a fine dining restaurant, right at home and sized perfectly for two! Flaky pastry is wrapped around tender filet mignon and flavorful sautéed mushrooms. Making two individual portions not only simplifies the process of making this leg...",24,"https://www.bettycrocker.com/recipes/beef-wellingtons-cooking-for-2/21c27035-a78f-4c15-9d91-929461b5d8ac",3));
        dishs.add(new Dish(5,"Slow-Cooker Chili Cheese Dog Casserole","Clear a spot in your dinner rotation: This slow-cooker spin on a beloved fair favorite is going to be a regular that gets raves (and leaves clean plates) every time! Using fridge staples that always seem to be on hand (like hot dogs, ground beef and tomato sauce), this ...",25,"https://www.bettycrocker.com/recipes/slow-cooker-chili-cheese-dog-casserole/09f3f680-b3a4-4e7d-9a1e-f06469f8ee09#reviewDiv",5));

        Categories = categories;
    }*/

    public List<Category> getCategories() {
        return Categories;
    }

    public void setCategories(List<Category> categories) {
        Categories = categories;
    }
}
