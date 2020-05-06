package com.example.newtut;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeinAdapter extends RecyclerView.Adapter<MeinAdapter.ViewHolder>{
	private List<String> items;

	public MeinAdapter(List<String> items) {
	    this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.item.setText(items.get(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
		public TextView item;

		public ViewHolder(View itemView) {
			super(itemView);
			item = (TextView)itemView.findViewById(R.id.item); 
		}
	}
}
