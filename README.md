# TreeListView
使用ListView实现树节点视图
```
 我们在使用的时候，首先创建一个适配器，去继承TreeListViewAdapter，并重写里面的方法。
```
 #### 用户在加载数据的时候必须调用的方法，
 ```
public void initData(List<T> datas,int defaultExpandLevel)
#### 加载数据后跟新适配器
```
initData(datas,defaultLevel);
//跟新适配器方法
this.notifyDataSetChanged();
```
#### 展开列表时显示的图片
```
public abstract int getIsExpDrawable();
//合并列表时显示的图片
public abstract int getIsColDrawable();
//数据在展开或收缩时调用
public void expandOrCollapse(int postion)
```
#### 点击图片设置展开与显示的方法
```
public void expandOrCollapse(int postion) 
```
#### 设置显示数据的视图
```
public View getConvertView(Node node, final int postion, View convertView, ViewGroup parent)
```

#### 设置item的点击事件需要调用的方法
```
adapter.setOnTreeNodeClickListener(TreeListViewAdapter.OnTreeNodeClickListener click);
```

