package com.iam_sid.studentregistration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdap extends BaseAdapter {
    String[] result;
    Context context;
    int[] imgId;
    private static LayoutInflater inflater = null;

    public CustomAdap(Context activity, String[] socialName, int[] socialImg) {

        result = socialName;
        context = activity;
        imgId = socialImg;

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;

    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView tv;
        ImageView imgv;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View rowView;

        rowView=inflater.inflate(R.layout.image_list,null);

        final Holder holder=new Holder();
        holder.tv=(TextView)rowView.findViewById(R.id.tvName);
        holder.imgv=(ImageView)rowView.findViewById(R.id.ivIcon);

        holder.tv.setText(result[position]);
        holder.imgv.setImageResource(imgId[position]);

        return rowView;
    }

}