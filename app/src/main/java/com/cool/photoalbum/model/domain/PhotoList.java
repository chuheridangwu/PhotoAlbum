package com.cool.photoalbum.model.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.chad.library.adapter.base.entity.SectionEntity;
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

    public static class FeedsBean implements IBasePhotoInfo {
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.fid);
            dest.writeString(this.image_large);
            dest.writeString(this.image_thumb);
            dest.writeString(this.image_width);
            dest.writeString(this.image_height);
            dest.writeString(this._$DCreateTs24);
            dest.writeString(this.favored);
            dest.writeBoolean(this.isHeader);
        }

        public FeedsBean() {
        }

        protected FeedsBean(Parcel in) {
            this.fid = in.readString();
            this.image_large = in.readString();
            this.image_thumb = in.readString();
            this.image_width = in.readString();
            this.image_height = in.readString();
            this._$DCreateTs24 = in.readString();
            this.favored = in.readString();
            this.isHeader = in.readBoolean();
        }

        public static final Parcelable.Creator<FeedsBean> CREATOR = new Parcelable.Creator<FeedsBean>() {
            @Override
            public FeedsBean createFromParcel(Parcel source) {
                return new FeedsBean(source);
            }

            @Override
            public FeedsBean[] newArray(int size) {
                return new FeedsBean[size];
            }
        };

        @Override
        public String smallUrl() {
            return image_thumb;
        }

        @Override
        public String bigUrl() {
            return image_large;
        }

        boolean isHeader;

        public void setHeader(boolean header) {
            isHeader = header;
        }

        @Override
        public boolean isHeader() {
            return isHeader;
        }

        @Override
        public int getItemType() {
            return isHeader ? SectionEntity.HEADER_TYPE : SectionEntity.NORMAL_TYPE;
        }
    }
}
