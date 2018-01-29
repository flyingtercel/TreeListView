package us.mifeng.treelistview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import us.mifeng.treelistview.R;
import us.mifeng.treenodes.Node;
import us.mifeng.treenodes.TreeListViewAdapter;

/**
 * Created by 黑夜之火 on 2018/1/26.
 */

public class TreeViewAdapter<T> extends TreeListViewAdapter {


    public TreeViewAdapter(Context context, ListView mTree) {
        super(context, mTree);
    }

    public void reloadData(List<T> datas, int defaultLevel){
        try {
            initData(datas,defaultLevel);
            this.notifyDataSetChanged();
        } catch (IllegalAccessException e) {
            e.getMessage();
        }
    }
    @Override
    public View getConvertView(Node node, final int postion, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.list_item,null);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        if (node.getIcon() == -1){
            vh.icon.setVisibility(View.INVISIBLE);
        }else{
            vh.icon.setVisibility(View.VISIBLE);
            vh.icon.setImageResource(node.getIcon());
        }
        vh.label.setText(node.getName());
        /*点击小三角展开与显示
        * */
        vh.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandOrCollapse(postion);
            }
        });
        return convertView;
    }

    @Override
    public int getIsExpDrawable() {
        return R.drawable.tree_ex;
    }

    @Override
    public int getIsColDrawable() {
        return R.drawable.tree_ec;
    }

    private final class ViewHolder{
        ImageView icon;
        TextView label;

        public ViewHolder(View view) {
            icon = (ImageView) view.findViewById(R.id.tree_node_icon);
            label = (TextView) view.findViewById(R.id.tree_node_lable);
        }
    }
}
