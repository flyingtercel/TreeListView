package us.mifeng.treelistview.bean;

import java.util.List;

import us.mifeng.treenodes.TreeNodeId;
import us.mifeng.treenodes.TreeNodeLabel;
import us.mifeng.treenodes.TreeNodePid;


/**
 * Created by 黑夜之火 on 2018/1/25.
 */

public class SpinnerBean {

    /**
     * Status : 200
     * Message : 获取成功
     * Data : [{"type":1,"id":"9e3978c08d9f69ed","name":"北京洪福","pinyin":"BJHF","pid":"429f5d0d79a95f8c","islast":1},{"type":1,"id":"bb65606ee92556fa","name":"合驰软件","pinyin":"HCRJ","pid":"a30231d74ad15167","islast":1},{"type":1,"id":"995a17cff2a8f169","name":"合驰","pinyin":"HC","pid":"a30231d74ad15167","islast":0},{"type":1,"id":"bc518a0c796f8223","name":"合驰","pinyin":"HC","pid":"995a17cff2a8f169","islast":1},{"type":1,"id":"429f5d0d79a95f8c","name":"洗衣粉","pinyin":"XYF","pid":"","islast":0},{"type":1,"id":"858822b5e8a8b443","name":"合驰","pinyin":"HC","pid":"995a17cff2a8f169","islast":1},{"type":1,"id":"a30231d74ad15167","name":"销售收入","pinyin":"XSSR","pid":"","islast":0},{"type":1,"id":"c85e3172b6af91f8","name":"产品","pinyin":"CP","pid":"c3a0129ba15071ce","islast":1},{"type":1,"id":"dbae8c1023acacda","name":"饲料","pinyin":"SL","pid":"6250eaab7aedc0b","islast":1},{"type":1,"id":"c3a0129ba15071ce","name":"业务收入1","pinyin":"YWSR1","pid":"cdd3d081ec8dc8b4","islast":0},{"type":1,"id":"ad895dc8aa929bf3","name":"业务收入1","pinyin":"YWSR1","pid":"c3a0129ba15071ce","islast":1},{"type":1,"id":"cdd3d081ec8dc8b4","name":"业务收入","pinyin":"YWSR","pid":"","islast":0},{"type":1,"id":"6250eaab7aedc0b","name":"销售收入","pinyin":"XSSR","pid":"c3546a803ca5aeaa","islast":0},{"type":1,"id":"45626f7d9fb29c8f","name":"流水","pinyin":"LS","pid":"6250eaab7aedc0b","islast":1},{"type":1,"id":"b189aa2948d3713a","name":"入股投入","pinyin":"RGTR","pid":"c855f444b0c9c9c2","islast":1},{"type":1,"id":"5adee2f46040a964","name":"微粒贷贷入","pinyin":"WLDDR","pid":"","islast":1},{"type":1,"id":"1f793de5151cb360","name":"销售收入","pinyin":"XSSR","pid":"6250eaab7aedc0b","islast":1},{"type":1,"id":"2d45a9e8cbe8de1d","name":"主营","pinyin":"ZY","pid":"c3546a803ca5aeaa","islast":1},{"type":1,"id":"bf22ee14979a5e5a","name":"222","pinyin":"222","pid":"","islast":1},{"type":1,"id":"ead64e4ee25857cc","name":"维修收入","pinyin":"WXSR","pid":"","islast":0},{"type":1,"id":"95428f246734eb78","name":"II哦哦哦","pinyin":"IIOOO","pid":"241a425e491566bc","islast":1},{"type":1,"id":"241a425e491566bc","name":"销售尾款","pinyin":"XSWK","pid":"","islast":0},{"type":1,"id":"c855f444b0c9c9c2","name":"执行款","pinyin":"ZXK","pid":"","islast":0},{"type":1,"id":"5d8832a0cf3b3e0c","name":"书费","pinyin":"SF","pid":"","islast":1},{"type":1,"id":"2f1ed5f9da1a26ea","name":"销售尾款","pinyin":"XSWK","pid":"241a425e491566bc","islast":1},{"type":1,"id":"edb1b5887de963cf","name":"销售收入","pinyin":"XSSR","pid":"ead64e4ee25857cc","islast":1},{"type":1,"id":"c974eccfab9b81f7","name":"执行案款","pinyin":"ZXAK","pid":"","islast":1},{"type":1,"id":"333218002560b57b","name":"快递","pinyin":"KD","pid":"","islast":1},{"type":1,"id":"5115ec6b2b63fa3d","name":"罚金","pinyin":"FJ","pid":"","islast":1},{"type":1,"id":"89f77d927c74a015","name":"MCO","pinyin":"MCO","pid":"edb1b5887de963cf","islast":1},{"type":1,"id":"998ab63bfe6c7844","name":"返程票号","pinyin":"FCPH","pid":"","islast":1},{"type":1,"id":"fcc0f523a0737d25","name":"机票销售","pinyin":"JPXS","pid":"","islast":1},{"type":2,"id":"11678db211ea5b6a","name":"蔬菜","pinyin":"SC","pid":"aff75e8cf91b2cb5","islast":1},{"type":2,"id":"aff75e8cf91b2cb5","name":"蔬菜市场","pinyin":"SCSC","pid":"","islast":0},{"type":2,"id":"bc0993758ff4d81","name":"自用","pinyin":"ZY","pid":"","islast":1},{"type":2,"id":"c806803793fb34b","name":"案款","pinyin":"AK","pid":"","islast":0},{"type":2,"id":"8986b537579b5a65","name":"许建","pinyin":"XJ","pid":"c806803793fb34b","islast":1},{"type":2,"id":"7693b0fb4892b732","name":"无","pinyin":"W","pid":"28c903cb5edba9aa","islast":1},{"type":2,"id":"415cf10fdee03307","name":"长江商学院","pinyin":"CJS?Y","pid":"4680bb225d34377d","islast":1},{"type":2,"id":"f6d956337d901d1","name":"长江","pinyin":"CJ","pid":"4680bb225d34377d","islast":1},{"type":2,"id":"2bd73b629bee6d13","name":"油费","pinyin":"YF","pid":"7fcfb81ea87fa159","islast":1},{"type":2,"id":"7fcfb81ea87fa159","name":"辅料","pinyin":"FL","pid":"","islast":0},{"type":2,"id":"174c2e670e7e3601","name":"蔬菜采购","pinyin":"SCCG","pid":"","islast":1},{"type":2,"id":"c002b2e2d6bc6e60","name":"微信公众号","pinyin":"WXGZH","pid":"28c903cb5edba9aa","islast":1},{"type":2,"id":"28c903cb5edba9aa","name":"签证费用","pinyin":"QZFY","pid":"","islast":0},{"type":2,"id":"c3546a803ca5aeaa","name":"主营","pinyin":"ZY","pid":"28c903cb5edba9aa","islast":0},{"type":2,"id":"4680bb225d34377d","name":"采购款","pinyin":"CGK","pid":"","islast":0},{"type":2,"id":"94b38cde01fcf1db","name":"江大姐","pinyin":"JDJ","pid":"4680bb225d34377d","islast":1},{"type":2,"id":"560b0eaa38717788","name":"油漆","pinyin":"YQ","pid":"","islast":1},{"type":2,"id":"91f410a631327381","name":"辅料","pinyin":"FL","pid":"7fcfb81ea87fa159","islast":1},{"type":2,"id":"1c47b6315422af63","name":"交通费","pinyin":"JTF","pid":"","islast":1},{"type":2,"id":"f62a45ef027c2c27","name":"住宿费","pinyin":"ZSF","pid":"","islast":1},{"type":2,"id":"8f97e78c9a21491b","name":"采购款","pinyin":"CGK","pid":"4680bb225d34377d","islast":1},{"type":2,"id":"5840bba14f19f448","name":"尾款","pinyin":"WK","pid":"","islast":1},{"type":2,"id":"881ca09c00c17e74","name":"房租","pinyin":"FZ","pid":"","islast":1},{"type":2,"id":"5c387c7e18db8eb2","name":"包装费用","pinyin":"BZFY","pid":"","islast":1},{"type":2,"id":"5645c11d32fef791","name":"机票","pinyin":"JP","pid":"","islast":1},{"type":2,"id":"2ba3a9c5526595c1","name":"签证费用","pinyin":"QZFY","pid":"28c903cb5edba9aa","islast":1},{"type":2,"id":"bd4c9bc1d1293ce4","name":"就餐费用","pinyin":"JCFY","pid":"","islast":1},{"type":2,"id":"f07444c73e358817","name":"物流费用","pinyin":"WLFY","pid":"","islast":1},{"type":2,"id":"fac25f044e5a80f5","name":"办公用品","pinyin":"BGYP","pid":"","islast":1},{"type":2,"id":"bd75269305c0ffbd","name":"差旅费用","pinyin":"CLFY","pid":"","islast":1},{"type":2,"id":"c7c58425c41795a5","name":"案款","pinyin":"AK","pid":"c806803793fb34b","islast":1},{"type":2,"id":"c980b87d16af87f","name":"采购物资","pinyin":"CGWZ","pid":"","islast":1},{"type":2,"id":"bf25015980d423db","name":"客运业务","pinyin":"KYYW","pid":"","islast":1},{"type":2,"id":"b07dd1731841cc60","name":"海运业务","pinyin":"HYYW","pid":"","islast":1},{"type":2,"id":"1e9e7849c71f63eb","name":"机票业务","pinyin":"JPYW","pid":"","islast":1},{"type":3,"id":"6cc620d85744c25b","name":"货物销售","pinyin":"HWXS","pid":"","islast":1},{"type":3,"id":"df995b134573c896","name":"签证","pinyin":"QZ","pid":"","islast":1},{"type":4,"id":"2f8abbd6b6f16d4d","name":"许建","pinyin":"XJ","pid":"1f8276ed39035f83","islast":1},{"type":4,"id":"1f8276ed39035f83","name":"许建","pinyin":"XJ","pid":"","islast":0},{"type":4,"id":"693fe70e83443417","name":"税费","pinyin":"SF","pid":"","islast":1},{"type":4,"id":"239f061e75c4dda2","name":"生活费用","pinyin":"SHFY","pid":"","islast":1},{"type":4,"id":"c98eda4509b41e2","name":"办公费用","pinyin":"BGFY","pid":"","islast":1}]
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
         * id : 9e3978c08d9f69ed
         * name : 北京洪福
         * pinyin : BJHF
         * pid : 429f5d0d79a95f8c
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

        @Override
        public String toString() {
            return "DataBean{" +
                    "type=" + type +
                    ", id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", pinyin='" + pinyin + '\'' +
                    ", pid='" + pid + '\'' +
                    ", islast=" + islast +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SpinnerBean{" +
                "Status=" + Status +
                ", Message='" + Message + '\'' +
                ", TotalQty=" + TotalQty +
                ", TotalPage=" + TotalPage +
                ", Data=" + Data +
                '}';
    }
}
