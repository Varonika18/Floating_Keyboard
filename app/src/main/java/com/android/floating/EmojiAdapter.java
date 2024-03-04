package com.android.floating;

// EmojiAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class EmojiAdapter extends RecyclerView.Adapter<EmojiViewHolder> {
    private List<String> emojiList;
    private OnItemClickListener onItemClickListener;

    public EmojiAdapter(List<String> emojiList) {
        this.emojiList = emojiList;
    }

    @NonNull
    @Override
    public EmojiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View emojiView = inflater.inflate(R.layout.item_emoji, parent, false);
        return new EmojiViewHolder(emojiView);
    }

    @Override
    public void onBindViewHolder(@NonNull EmojiViewHolder holder, int position) {
        String emoji = emojiList.get(position);
        holder.emojiTextView.setText(emoji);

        // Handle item click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (onItemClickListener != null) {
//                    onItemClickListener.onItemClick(view, position);
//                }
                Toast.makeText(view.getContext(), String.valueOf(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return emojiList.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }


    public void setOnItemClickListener(SoftKeyboard softKeyboard) {

    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
}
