package com.android.floating;

// EmojiViewHolder.java
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmojiViewHolder extends RecyclerView.ViewHolder {
    public TextView emojiTextView;

    public EmojiViewHolder(@NonNull View itemView) {
        super(itemView);
        emojiTextView = itemView.findViewById(R.id.emojiTextView);

    }
}
