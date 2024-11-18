package com.example.groceryshopapp;

import android.os.Bundle;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private List<String> categoryList;
    private HashMap<String, List<String>> productList;
    private CustomExpandableListAdapter expandableListAdapter; // Updated here to use CustomExpandableListAdapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ExpandableListView
        expandableListView = findViewById(R.id.expandableListView);

        // Initialize category and product data
        categoryList = new ArrayList<>();
        productList = new HashMap<>();

        // Sample data
        categoryList.add("Fruits");
        categoryList.add("Vegetables");
        categoryList.add("Dairy");

        // Products for each category
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Tomato");
        vegetables.add("Cucumber");

        List<String> dairy = new ArrayList<>();
        dairy.add("Milk");
        dairy.add("Cheese");
        dairy.add("Butter");

        // Putting the products into the product list with category names as keys
        productList.put("Fruits", fruits);
        productList.put("Vegetables", vegetables);
        productList.put("Dairy", dairy);

        // Set the adapter for the ExpandableListView
        expandableListAdapter = new CustomExpandableListAdapter(this, categoryList, productList); // Using the new adapter name
        expandableListView.setAdapter(expandableListAdapter);
    }
}
