package com.example.octodroid.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.octodroid.R;
import com.rejasupotaro.octodroid.models.Repository;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SelectableRepositoryItemViewHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.repository_name_text)
    TextView repositoryNameTextView;
    @Bind(R.id.description)
    TextView descriptionTextView;

    public static SelectableRepositoryItemViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_selectable_repository, parent, false);
        return new SelectableRepositoryItemViewHolder(view);
    }

    public SelectableRepositoryItemViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bind(final Repository repository) {
        repositoryNameTextView.setText(String.format("%s / %s",
                repository.getOwner().getLogin(),
                repository.getName()));
        descriptionTextView.setText(repository.getDescription());
    }
}
