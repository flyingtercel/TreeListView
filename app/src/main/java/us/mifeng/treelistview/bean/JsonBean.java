package us.mifeng.treelistview.bean;

import java.util.List;

import us.mifeng.treenodes.TreeNodeId;
import us.mifeng.treenodes.TreeNodeLabel;
import us.mifeng.treenodes.TreeNodePid;


/**
 * Created by 黑夜之火 on 2018/1/23.
 */

public class JsonBean {

    /**
     * Status : 200
     * Message : 查询成功
     * Data : [{"id":"9e3978c08d9f69ed","pid":"429f5d0d79a95f8c","name":"北京洪福","amount":12234,"total":12234,"islast":1,"type":1},{"id":"429f5d0d79a95f8c","pid":"1","name":"洗衣粉","amount":12234,"total":12234,"islast":0,"type":1},{"id":"bb65606ee92556fa","pid":"a30231d74ad15167","name":"合驰软件","amount":4200,"total":4200,"islast":1,"type":1},{"id":"a30231d74ad15167","pid":"1","name":"销售收入","amount":91200,"total":91200,"islast":0,"type":1},{"id":"995a17cff2a8f169","pid":"a30231d74ad15167","name":"合驰","amount":87000,"total":87000,"islast":0,"type":1},{"id":"bc518a0c796f8223","pid":"995a17cff2a8f169","name":"合驰","amount":85000,"total":85000,"islast":1,"type":1},{"id":"858822b5e8a8b443","pid":"995a17cff2a8f169","name":"合驰","amount":2000,"total":2000,"islast":1,"type":1},{"id":"c85e3172b6af91f8","pid":"c3a0129ba15071ce","name":"产品","amount":1013000,"total":1013000,"islast":1,"type":1},{"id":"c3a0129ba15071ce","pid":"cdd3d081ec8dc8b4","name":"业务收入1","amount":1025000,"total":1025000,"islast":0,"type":1},{"id":"cdd3d081ec8dc8b4","pid":"1","name":"业务收入","amount":1025000,"total":1025000,"islast":0,"type":1},{"id":"dbae8c1023acacda","pid":"6250eaab7aedc0b","name":"饲料","amount":34,"total":34,"islast":1,"type":1},{"id":"6250eaab7aedc0b","pid":"c3546a803ca5aeaa","name":"销售收入","amount":2997,"total":2997,"islast":0,"type":1},{"id":"c3546a803ca5aeaa","pid":"28c903cb5edba9aa","name":"主营","amount":2997,"total":7997,"islast":0,"type":2},{"id":"28c903cb5edba9aa","pid":"2","name":"签证费用","amount":2997,"total":7997,"islast":0,"type":2},{"id":"ad895dc8aa929bf3","pid":"c3a0129ba15071ce","name":"业务收入1","amount":12000,"total":12000,"islast":1,"type":1},{"id":"1f793de5151cb360","pid":"6250eaab7aedc0b","name":"销售收入","amount":2963,"total":2963,"islast":1,"type":1},{"id":"fcc0f523a0737d25","pid":"1","name":"机票销售","amount":2000,"total":2000,"islast":1,"type":1},{"id":"11678db211ea5b6a","pid":"aff75e8cf91b2cb5","name":"蔬菜","amount":1000,"total":1000,"islast":1,"type":2},{"id":"aff75e8cf91b2cb5","pid":"2","name":"蔬菜市场","amount":1000,"total":1000,"islast":0,"type":2},{"id":"bc0993758ff4d81","pid":"2","name":"自用","amount":101293,"total":101293,"islast":1,"type":2},{"id":"2bd73b629bee6d13","pid":"7fcfb81ea87fa159","name":"油费","amount":1000,"total":1000,"islast":1,"type":2},{"id":"7fcfb81ea87fa159","pid":"2","name":"辅料","amount":1000,"total":1000,"islast":0,"type":2},{"id":"174c2e670e7e3601","pid":"2","name":"蔬菜采购","amount":520,"total":520,"islast":1,"type":2},{"id":"560b0eaa38717788","pid":"2","name":"油漆","amount":88,"total":88,"islast":1,"type":2},{"id":"1c47b6315422af63","pid":"2","name":"交通费","amount":380,"total":380,"islast":1,"type":2},{"id":"bd4c9bc1d1293ce4","pid":"2","name":"就餐费用","amount":79,"total":79,"islast":1,"type":2},{"id":"fac25f044e5a80f5","pid":"2","name":"办公用品","amount":600,"total":600,"islast":1,"type":2},{"id":"c980b87d16af87f","pid":"2","name":"采购物资","amount":29,"total":29,"islast":1,"type":2},{"id":"1","pid":"","name":"收入合计","amount":1130434,"total":1130434,"islast":0,"type":0},{"id":"2","pid":"","name":"支出合计","amount":107986,"total":112986,"islast":0,"type":0},{"id":"3","pid":"","name":"利润合计","amount":1022448,"total":1017448,"islast":0,"type":0}]
     * TotalQty : null
     * TotalPage : null
     */

    private int Status;
    private String Message;
    private Object TotalQty;
    private Object TotalPage;
    private List<DataBean> Data;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Object getTotalQty() {
        return TotalQty;
    }

    public void setTotalQty(Object TotalQty) {
        this.TotalQty = TotalQty;
    }

    public Object getTotalPage() {
        return TotalPage;
    }

    public void setTotalPage(Object TotalPage) {
        this.TotalPage = TotalPage;
    }

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * id : 9e3978c08d9f69ed
         * pid : 429f5d0d79a95f8c
         * name : 北京洪福
         * amount : 12234
         * total : 12234
         * islast : 1
         * type : 1
         */
        /**
         * 是否展开
         */
        private boolean isExpand = false;

        public boolean isExpand() {
            return isExpand;
        }

        public void setExpand(boolean expand) {
            isExpand = expand;
        }

        @TreeNodeId
        private String id;
        @TreeNodePid
        private String pid;
        @TreeNodeLabel
        private String name;
        private int amount;
        private int total;
        private int islast;
        private int type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getIslast() {
            return islast;
        }

        public void setIslast(int islast) {
            this.islast = islast;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
