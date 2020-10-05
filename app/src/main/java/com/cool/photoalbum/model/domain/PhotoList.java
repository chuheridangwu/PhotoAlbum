package com.cool.photoalbum.model.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhotoList {


    /**
     * succ : 1
     * feeds : [{"fid":"5634","image_large":"http://cdn5.ziti2.com/papers/d76/ee7/c4dcfb2472949964cb1d1b76cf.jpg","image_thumb":"http://cdn5.ziti2.com/papers/d76/ee7/c4dcfb2472949964cb1d1b76cf.jpg!small","image_width":"640","image_height":"1136","d.create.ts":"1428212294.5374","favored":"22"}]
     */

    private int succ;
    private List<FeedsBean> feeds;

    public int getSucc() {
        return succ;
    }

    public void setSucc(int succ) {
        this.succ = succ;
    }

    public List<FeedsBean> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<FeedsBean> feeds) {
        this.feeds = feeds;
    }

    public static class FeedsBean {
        /**
         * fid : 5634
         * image_large : http://cdn5.ziti2.com/papers/d76/ee7/c4dcfb2472949964cb1d1b76cf.jpg
         * image_thumb : http://cdn5.ziti2.com/papers/d76/ee7/c4dcfb2472949964cb1d1b76cf.jpg!small
         * image_width : 640
         * image_height : 1136
         * d.create.ts : 1428212294.5374
         * favored : 22
         */

        private String fid;
        private String image_large;
        private String image_thumb;
        private String image_width;
        private String image_height;
        @SerializedName("d.create.ts")
        private String _$DCreateTs24; // FIXME check this code
        private String favored;

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getImage_large() {
            return image_large;
        }

        public void setImage_large(String image_large) {
            this.image_large = image_large;
        }

        public String getImage_thumb() {
            return image_thumb;
        }

        public void setImage_thumb(String image_thumb) {
            this.image_thumb = image_thumb;
        }

        public String getImage_width() {
            return image_width;
        }

        public void setImage_width(String image_width) {
            this.image_width = image_width;
        }

        public String getImage_height() {
            return image_height;
        }

        public void setImage_height(String image_height) {
            this.image_height = image_height;
        }

        public String get_$DCreateTs24() {
            return _$DCreateTs24;
        }

        public void set_$DCreateTs24(String _$DCreateTs24) {
            this._$DCreateTs24 = _$DCreateTs24;
        }

        public String getFavored() {
            return favored;
        }

        public void setFavored(String favored) {
            this.favored = favored;
        }

        @Override
        public String toString() {
            return "FeedsBean{" +
                    "fid='" + fid + '\'' +
                    ", image_large='" + image_large + '\'' +
                    ", image_thumb='" + image_thumb + '\'' +
                    ", image_width='" + image_width + '\'' +
                    ", image_height='" + image_height + '\'' +
                    ", _$DCreateTs24='" + _$DCreateTs24 + '\'' +
                    ", favored='" + favored + '\'' +
                    '}';
        }
    }
}
