package cand.layout.recyclevn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cand.layout.recyclevn.Adapters.ContactAdapter;
import cand.layout.recyclevn.models.Contact;

public class MainActivity extends AppCompatActivity  implements ContactAdapter.OnContactClickListener  {
    public RecyclerView rv;
    public ContactAdapter contactAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Contact> listContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rvContact);
        listContact.add(new Contact("Arsenal",
                "6","https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-14-512.png",
                "3"));

        listContact.add(new Contact("Chelsea",
                "6","https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-22-512.png",
                "2"));

        listContact.add(new Contact("Liverpol",
                "5","https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-21-512.png",
                "2"));

        listContact.add(new Contact("Manchester United",
                "4","https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-26-512.png",
                "1"));


        contactAdapter = new ContactAdapter(listContact);
        contactAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(layoutManager);

    }

    @Override
    public void onClick(View view, int position) {
        Contact contact = listContact.get(position);
        Toast.makeText(this, contact.getName(), Toast.LENGTH_LONG).show();
    }
}