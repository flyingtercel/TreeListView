package us.mifeng.treelistview.bean;

import java.util.List;

import us.mifeng.treenodes.TreeNodeId;
import us.mifeng.treenodes.TreeNodeLabel;
import us.mifeng.treenodes.TreeNodePid;

/**
 * Created by 黑夜之火 on 2018/1/26.
 */

public class TestBean {

    /**
     * Status : 200
     * Message : 获取成功
     * Data : [{"type":1,"id":"32999e9c4215236e","name":"三八席","pinyin":"SBX","pid":"ff3bf9d884376343","islast":1},{"type":1,"id":"ff3bf9d884376343","name":"餐饮","pinyin":"CY","pid":"","islast":0},{"type":1,"id":"a8333051aeed1c28","name":"现收运费","pinyin":"XSYF","pid":"","islast":1},{"type":1,"id":"3f1b0934fc968087","name":"提付运费","pinyin":"TFYF","pid":"","islast":1},{"type":1,"id":"b199fec59c04e6ff","name":"工商注册","pinyin":"GSZC","pid":"96129565590684a2","islast":1},{"type":1,"id":"96129565590684a2","name":"回单收","pinyin":"HDS","pid":"","islast":0},{"type":1,"id":"effbde6b3e7dea97","name":"产品收入","pinyin":"CPSR","pid":"96129565590684a2","islast":1},{"type":2,"id":"e49ca26f494e2993","name":"茅台","pinyin":"MT","pid":"","islast":1},{"type":2,"id":"b66a0bf22caa11ca","name":"固定资产","pinyin":"GDZC","pid":"6d64772d1bcfa21b","islast":1},{"type":2,"id":"1e9323165430f861","name":"货款","pinyin":"HK","pid":"6d64772d1bcfa21b","islast":1},{"type":2,"id":"6d64772d1bcfa21b","name":"采购","pinyin":"CG","pid":"","islast":0},{"type":2,"id":"a225c5137d867ad3","name":"进货","pinyin":"JH","pid":"6d64772d1bcfa21b","islast":1},{"type":2,"id":"fb18499b521101d8","name":"采购","pinyin":"CG","pid":"6d64772d1bcfa21b","islast":1},{"type":2,"id":"bca7c056c134a408","name":"工资发放","pinyin":"GZFF","pid":"","islast":1},{"type":2,"id":"5f8c0d00cfbbec21","name":"游戏支出","pinyin":"YXZC","pid":"d87c6b79b0804532","islast":1},{"type":2,"id":"ed19f5df8dab59df","name":"睡觉支出","pinyin":"SJZC","pid":"d87c6b79b0804532","islast":1},{"type":2,"id":"ad995cfbd3aa54c5","name":"吃饭支出","pinyin":"CFZC","pid":"d87c6b79b0804532","islast":1},{"type":2,"id":"d87c6b79b0804532","name":"日常支出","pinyin":"RCZC","pid":"","islast":0},{"type":3,"id":"be5dcc7ced98a58a","name":"基金收益","pinyin":"JJSY","pid":"","islast":1},{"type":4,"id":"32b07ec4517c6504","name":"呵呵呵呵","pinyin":"HHHH","pid":"15b0657f654ca2a7","islast":1},{"type":4,"id":"15b0657f654ca2a7","name":"买彩票","pinyin":"MCP","pid":"","islast":0},{"type":4,"id":"ec04eff770c0ccdf","name":"买彩票","pinyin":"MCP","pid":"15b0657f654ca2a7","islast":1}]
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
         * type : 1
         * id : 32999e9c4215236e
         * name : 三八席
         * pinyin : SBX
         * pid : ff3bf9d884376343
      * islast : 1
         */

        private int type;
        @TreeNodeId
        private String id;
        @TreeNodeLabel
        private String name;
        private String pinyin;
        @TreeNodePid
        private String pid;
        private int islast;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public int getIslast() {
            return islast;
        }

        public void setIslast(int islast) {
            this.islast = islast;
        }
    }
}
