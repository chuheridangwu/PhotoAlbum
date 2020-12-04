package com.cool.photoalbum.model.domain;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

import com.chad.library.adapter.base.entity.SectionEntity;

import java.util.ArrayList;
import java.util.List;

public class LiveInfo {

    private List<ZhuboBean> zhubo;

    public List<ZhuboBean> getZhubo() {
        return zhubo;
    }

    public void setZhubo(List<ZhuboBean> zhubo) {
        this.zhubo = zhubo;
    }

    public static class ZhuboBean implements IBasePhotoInfo {
        /**
         * address : http://bssource.rtc.inke.cn/live/1607050650412287.flv?auth_version=1&codecInfo=8192&dpSrc=6&from=hallfe&ikChorus=1&ikDnsOp=1&ikFastRate=1.1&ikHost=bsy&ikLiveType=normal&ikLog=1&ikMaxBuf=3600&ikMinBuf=2900&ikNetOp=01111&ikOp=0&ikSlowRate=0.9&ikSyncBeta=1&md5sum=ef5f&pushHost=clsTrans.push.cls.inke.cn&timestamp=1607052399
         * img : http://img.ikstatic.cn/MTU1NDE5NDA2NyM4MzI=.jpg
         * title : 涵九儿%3F%3F
         */

        private String address;
        private String img;
        private String title;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.address);
            dest.writeString(this.img);
            dest.writeString(this.title);
            dest.writeBoolean(this.isHeader);
        }

        public ZhuboBean() {
        }

        @RequiresApi(api = Build.VERSION_CODES.Q)
        protected ZhuboBean(Parcel in) {
            this.address = in.readString();
            this.img = in.readString();
            this.title = in.readString();
            this.isHeader = in.readBoolean();

        }

        public static final Creator<ZhuboBean> CREATOR = new Creator<ZhuboBean>() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public ZhuboBean createFromParcel(Parcel source) {
                return new ZhuboBean(source);
            }

            @Override
            public ZhuboBean[] newArray(int size) {
                return new ZhuboBean[size];
            }
        };

        @Override
        public String smallUrl() {
            return img;
        }

        @Override
        public String bigUrl() {
            return img;
        }

        @Override
        public String videoUrl() {
            return address;
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
