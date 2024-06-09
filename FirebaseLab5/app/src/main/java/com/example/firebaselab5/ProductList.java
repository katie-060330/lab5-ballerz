package com.example.firebaselab5;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProductList extends ArrayAdapter<Product> {

    private Activity context;
    List<Product> products;

    public ProductList(Activity context, List<Product> products) {
        super(context, R.layout.activity_ayout_product_item, products);
        this.context = context;
        this.products = products;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_ayout_product_item, null, true);

        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewPrice = listViewItem.findViewById(R.id.textViewPrice);

        Product product = products.get(position);
        textViewName.setText(product.getProductName());
        textViewPrice.setText(String.valueOf(product.getPrice()));
        return listViewItem;
    }


}