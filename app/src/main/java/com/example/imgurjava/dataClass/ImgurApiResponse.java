package com.example.imgurjava.dataClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImgurApiResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("status")
    @Expose
    private Integer status;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("datetime")
        @Expose
        private Integer datetime;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("animated")
        @Expose
        private Boolean animated;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("size")
        @Expose
        private Integer size;
        @SerializedName("views")
        @Expose
        private Integer views;
        @SerializedName("bandwidth")
        @Expose
        private Long bandwidth;
        @SerializedName("vote")
        @Expose
        private Object vote;
        @SerializedName("favorite")
        @Expose
        private Boolean favorite;
        @SerializedName("nsfw")
        @Expose
        private Boolean nsfw;
        @SerializedName("section")
        @Expose
        private String section;
        @SerializedName("account_url")
        @Expose
        private Object accountUrl;
        @SerializedName("account_id")
        @Expose
        private Object accountId;
        @SerializedName("is_ad")
        @Expose
        private Boolean isAd;
        @SerializedName("in_most_viral")
        @Expose
        private Boolean inMostViral;
        @SerializedName("has_sound")
        @Expose
        private Boolean hasSound;
        @SerializedName("tags")
        @Expose
        private List<Object> tags = null;
        @SerializedName("ad_type")
        @Expose
        private Integer adType;
        @SerializedName("ad_url")
        @Expose
        private String adUrl;
        @SerializedName("edited")
        @Expose
        private Integer edited;
        @SerializedName("in_gallery")
        @Expose
        private Boolean inGallery;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("ad_config")
        @Expose
        private AdConfig adConfig;
        @SerializedName("comment_count")
        @Expose
        private Object commentCount;
        @SerializedName("favorite_count")
        @Expose
        private Object favoriteCount;
        @SerializedName("ups")
        @Expose
        private Object ups;
        @SerializedName("downs")
        @Expose
        private Object downs;
        @SerializedName("points")
        @Expose
        private Object points;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("is_album")
        @Expose
        private Boolean isAlbum;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Integer getDatetime() {
            return datetime;
        }

        public void setDatetime(Integer datetime) {
            this.datetime = datetime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getAnimated() {
            return animated;
        }

        public void setAnimated(Boolean animated) {
            this.animated = animated;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getViews() {
            return views;
        }

        public void setViews(Integer views) {
            this.views = views;
        }

        public Long getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
        }

        public Object getVote() {
            return vote;
        }

        public void setVote(Object vote) {
            this.vote = vote;
        }

        public Boolean getFavorite() {
            return favorite;
        }

        public void setFavorite(Boolean favorite) {
            this.favorite = favorite;
        }

        public Boolean getNsfw() {
            return nsfw;
        }

        public void setNsfw(Boolean nsfw) {
            this.nsfw = nsfw;
        }

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
        }

        public Object getAccountUrl() {
            return accountUrl;
        }

        public void setAccountUrl(Object accountUrl) {
            this.accountUrl = accountUrl;
        }

        public Object getAccountId() {
            return accountId;
        }

        public void setAccountId(Object accountId) {
            this.accountId = accountId;
        }

        public Boolean getIsAd() {
            return isAd;
        }

        public void setIsAd(Boolean isAd) {
            this.isAd = isAd;
        }

        public Boolean getInMostViral() {
            return inMostViral;
        }

        public void setInMostViral(Boolean inMostViral) {
            this.inMostViral = inMostViral;
        }

        public Boolean getHasSound() {
            return hasSound;
        }

        public void setHasSound(Boolean hasSound) {
            this.hasSound = hasSound;
        }

        public List<Object> getTags() {
            return tags;
        }

        public void setTags(List<Object> tags) {
            this.tags = tags;
        }

        public Integer getAdType() {
            return adType;
        }

        public void setAdType(Integer adType) {
            this.adType = adType;
        }

        public String getAdUrl() {
            return adUrl;
        }

        public void setAdUrl(String adUrl) {
            this.adUrl = adUrl;
        }

        public Integer getEdited() {
            return edited;
        }

        public void setEdited(Integer edited) {
            this.edited = edited;
        }

        public Boolean getInGallery() {
            return inGallery;
        }

        public void setInGallery(Boolean inGallery) {
            this.inGallery = inGallery;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public AdConfig getAdConfig() {
            return adConfig;
        }

        public void setAdConfig(AdConfig adConfig) {
            this.adConfig = adConfig;
        }

        public Object getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(Object commentCount) {
            this.commentCount = commentCount;
        }

        public Object getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(Object favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public Object getUps() {
            return ups;
        }

        public void setUps(Object ups) {
            this.ups = ups;
        }

        public Object getDowns() {
            return downs;
        }

        public void setDowns(Object downs) {
            this.downs = downs;
        }

        public Object getPoints() {
            return points;
        }

        public void setPoints(Object points) {
            this.points = points;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Boolean getIsAlbum() {
            return isAlbum;
        }

        public void setIsAlbum(Boolean isAlbum) {
            this.isAlbum = isAlbum;
        }

    }

    public class AdConfig {

        @SerializedName("safeFlags")
        @Expose
        private List<String> safeFlags = null;
        @SerializedName("highRiskFlags")
        @Expose
        private List<Object> highRiskFlags = null;
        @SerializedName("unsafeFlags")
        @Expose
        private List<Object> unsafeFlags = null;
        @SerializedName("wallUnsafeFlags")
        @Expose
        private List<Object> wallUnsafeFlags = null;
        @SerializedName("showsAds")
        @Expose
        private Boolean showsAds;

        public List<String> getSafeFlags() {
            return safeFlags;
        }

        public void setSafeFlags(List<String> safeFlags) {
            this.safeFlags = safeFlags;
        }

        public List<Object> getHighRiskFlags() {
            return highRiskFlags;
        }

        public void setHighRiskFlags(List<Object> highRiskFlags) {
            this.highRiskFlags = highRiskFlags;
        }

        public List<Object> getUnsafeFlags() {
            return unsafeFlags;
        }

        public void setUnsafeFlags(List<Object> unsafeFlags) {
            this.unsafeFlags = unsafeFlags;
        }

        public List<Object> getWallUnsafeFlags() {
            return wallUnsafeFlags;
        }

        public void setWallUnsafeFlags(List<Object> wallUnsafeFlags) {
            this.wallUnsafeFlags = wallUnsafeFlags;
        }

        public Boolean getShowsAds() {
            return showsAds;
        }

        public void setShowsAds(Boolean showsAds) {
            this.showsAds = showsAds;
        }

    }
}
