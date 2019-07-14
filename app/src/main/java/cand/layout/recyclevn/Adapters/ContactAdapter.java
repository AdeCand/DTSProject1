package cand.layout.recyclevn.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import cand.layout.recyclevn.R;
import cand.layout.recyclevn.models.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<Contact> contactList = new ArrayList<>();

    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    private OnContactClickListener listener;

    public interface OnContactClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(OnContactClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_contact,viewGroup,false);
        ContactViewHolder viewHolder = new ContactViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
        Contact item = contactList.get(i);
        contactViewHolder.txtTelp.setText(item.getPhone());
        contactViewHolder.txtName.setText(item.getName());
        contactViewHolder.txtWin.setText(item.getName());
        Picasso.get().load(item.getImageUrl()).placeholder(R.drawable.ic_launcher_background).into(contactViewHolder.imageContact);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageContact;
        public TextView txtName,txtTelp,txtWin;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            imageContact = itemView.findViewById(R.id.imageContact);
            txtName = itemView.findViewById(R.id.textNama);
            txtTelp = itemView.findViewById(R.id.textTelp);
            txtWin = itemView.findViewById(R.id.txtWin);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}
