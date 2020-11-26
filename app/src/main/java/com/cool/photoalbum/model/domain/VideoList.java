package com.cool.photoalbum.model.domain;

import android.os.Parcel;

import com.chad.library.adapter.base.entity.SectionEntity;

public class VideoList implements IBasePhotoInfo {

    /**
     * set : 31
     * uid : null
     * opensearch : false
     * shareurl : http://service.videowp.adesk.com/v1/analytics?id=5fb9ac2d31f6133497290380&type=share
     * share : 11
     * height : 2160
     * download : 59
     * bit_rate : 10595196
     * tag :
     * video : http://cdn.video.aibizhi.dandanjiang.tv/5fb9ac2d31f6133497290380.mp4?sign=066d1b6665322057b253a1c01c093f6b&t=5fbe17bc
     * duration : 95
     * click : 740
     * favnum : 0
     * category : 5930e061e7bce72ce01371ae
     * img : http://cdn.video.aibizhi.dandanjiang.tv/5fb9ac2d31f6133497290380.jpg?imageMogr2/thumbnail/!350x540r/gravity/Center/crop/350x540&sign=5c10d235c8d7785f8e2379d7306e367d&t=5fbe17bc
     * privacy : public
     * user : {"name":"","viptime":0,"auth":"adesk","follower":430,"avatar":"","isvip":false,"id":""}
     * clickurl : http://service.videowp.adesk.com/v1/analytics?id=5fb9ac2d31f6133497290380&type=click
     * id : 5fb9ac2d31f6133497290380
     * width : 1080
     * play : 622
     * favoriteurl : http://service.videowp.adesk.com/v1/analytics?id=5fb9ac2d31f6133497290380&type=favorite
     * downloadurl : http://service.videowp.adesk.com/v1/analytics?id=5fb9ac2d31f6133497290380&type=download
     * view_video : http://cdn.video.aibizhi.dandanjiang.tv/5fb9ac2d31f6133497290380_view.mp4?sign=8f891ec3910125b734ecec72e39ff5cf&t=5fbe17bc
     * adult : false
     * atime : 2020-11-24 16:11:06
     * desc : null
     * name : 一想到你我就哦哦哦哦哦😂
     * viewurl : http://service.videowp.adesk.com/v1/analytics?id=5fb9ac2d31f6133497290380&type=view
     * favorite : 0
     * seturl : http://service.videowp.adesk.com/v1/analytics?id=5fb9ac2d31f6133497290380&type=set
     * playurl : http://service.videowp.adesk.com/v1/analytics?id=5fb9ac2d31f6133497290380&type=play
     * view : 799
     */

    private int set;
    private Object uid;
    private boolean opensearch;
    private String shareurl;
    private int share;
    private int height;
    private int download;
    private int bit_rate;
    private String tag;
    private String video;
    private int duration;
    private int click;
    private int favnum;
    private String category;
    private String img;
    private String privacy;
    private UserBean user;
    private String clickurl;
    private String id;
    private int width;
    private int play;
    private String favoriteurl;
    private String downloadurl;
    private String view_video;
    private boolean adult;
    private String atime;
    private Object desc;
    private String name;
    private String viewurl;
    private int favorite;
    private String seturl;
    private String playurl;
    private int view;

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public Object getUid() {
        return uid;
    }

    public void setUid(Object uid) {
        this.uid = uid;
    }

    public boolean isOpensearch() {
        return opensearch;
    }

    public void setOpensearch(boolean opensearch) {
        this.opensearch = opensearch;
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public int getBit_rate() {
        return bit_rate;
    }

    public void setBit_rate(int bit_rate) {
        this.bit_rate = bit_rate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public int getFavnum() {
        return favnum;
    }

    public void setFavnum(int favnum) {
        this.favnum = favnum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getClickurl() {
        return clickurl;
    }

    public void setClickurl(String clickurl) {
        this.clickurl = clickurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public String getFavoriteurl() {
        return favoriteurl;
    }

    public void setFavoriteurl(String favoriteurl) {
        this.favoriteurl = favoriteurl;
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
    }

    public String getView_video() {
        return view_video;
    }

    public void setView_video(String view_video) {
        this.view_video = view_video;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getAtime() {
        return atime;
    }

    public void setAtime(String atime) {
        this.atime = atime;
    }

    public Object getDesc() {
        return desc;
    }

    public void setDesc(Object desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViewurl() {
        return viewurl;
    }

    public void setViewurl(String viewurl) {
        this.viewurl = viewurl;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public String getSeturl() {
        return seturl;
    }

    public void setSeturl(String seturl) {
        this.seturl = seturl;
    }

    public String getPlayurl() {
        return playurl;
    }

    public void setPlayurl(String playurl) {
        this.playurl = playurl;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String smallUrl() {
        return img;
    }

    @Override
    public String bigUrl() {
        return img;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

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

    public static class UserBean {
        /**
         * name :
         * viptime : 0
         * auth : adesk
         * follower : 430
         * avatar :
         * isvip : false
         * id :
         */

        private String name;
        private int viptime;
        private String auth;
        private int follower;
        private String avatar;
        private boolean isvip;
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getViptime() {
            return viptime;
        }

        public void setViptime(int viptime) {
            this.viptime = viptime;
        }

        public String getAuth() {
            return auth;
        }

        public void setAuth(String auth) {
            this.auth = auth;
        }

        public int getFollower() {
            return follower;
        }

        public void setFollower(int follower) {
            this.follower = follower;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public boolean isIsvip() {
            return isvip;
        }

        public void setIsvip(boolean isvip) {
            this.isvip = isvip;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
