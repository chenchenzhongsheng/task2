package com.jnshu.model;

 // create by xiaobai  on 2017.8.30
public class User {
    private Integer id;
    private String name;
    private String qq;
    private String style;
    private Long estimated_time;
    private String graduate_institutions;
    private String online_id;
    private String daily_link;
    private String pledge;
    private String senior_tutor;
    private String source;

    private Long create_at;
    private Long updata_at;

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getQq() {
         return qq;
     }

     public void setQq(String qq) {
         this.qq = qq;
     }

     public String getStyle() {
         return style;
     }

     public void setStyle(String style) {
         this.style = style;
     }

     public Long getEstimated_time() {
         return estimated_time;
     }

     public void setEstimated_time(Long estimated_time) {
         this.estimated_time = estimated_time;
     }

     public String getGraduate_institutions() {
         return graduate_institutions;
     }

     public void setGraduate_institutions(String graduate_institutions) {
         this.graduate_institutions = graduate_institutions;
     }

     public String getOnline_id() {
         return online_id;
     }

     public void setOnline_id(String nonline_id) {
         this.online_id = nonline_id;
     }

     public String getDaily_link() {
         return daily_link;
     }

     public void setDaily_link(String daily_link) {
         this.daily_link = daily_link;
     }

     public String getPledge() {
         return pledge;
     }

     public void setPledge(String pledge) {
         this.pledge = pledge;
     }

     public String getSenior_tutor() {
         return senior_tutor;
     }

     public void setSenior_tutor(String senior_tutor) {
         this.senior_tutor = senior_tutor;
     }

     public String getSource() {
         return source;
     }

     public void setSource(String source) {
         this.source = source;
     }

     public Long getCreate_at() {
         return create_at;
     }

     public void setCreate_at(Long create_at) {
         this.create_at = create_at;
     }

     public Long getUpdata_at() {
         return updata_at;
     }

     public void setUpdata_at(Long update_at) {
         this.updata_at = update_at;
     }

     @Override
     public String toString() {
         return "User{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", qq='" + qq + '\'' +
                 ", style='" + style + '\'' +
                 ", estimated_time=" + estimated_time +
                 ", graduate_institutions='" + graduate_institutions + '\'' +
                 ", online_id='" + online_id + '\'' +
                 ", daily_link='" + daily_link + '\'' +
                 ", pledge='" + pledge + '\'' +
                 ", senior_tutor='" + senior_tutor + '\'' +
                 ", source='" + source + '\'' +
                 ", create_at=" + create_at +
                 ", updata_at=" + updata_at +
                 '}';
     }
 }
