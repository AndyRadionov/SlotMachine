package aaa.bbb.ccc09.slotsmachine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aaa.bbb.ccc09.R;

public class SlotAdapter extends RecyclerView.Adapter<SlotAdapter.ViewHolder> {
    private List<Integer> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mImageView = v.findViewById(R.id.image_view);
        }
    }

    public SlotAdapter(List<Integer> myDataset) {
        mDataset = new ArrayList<>(myDataset);
        Collections.shuffle(mDataset);
    }

    @NonNull
    @Override
    public SlotAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                     int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int dataIndex = mDataset.get(position % mDataset.size());
        holder.mImageView.setImageResource(dataIndex);
        holder.mImageView.setTag(dataIndex);


    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}