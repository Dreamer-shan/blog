package com.shy.queryvo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2020/10/29/21:35
 * @Description:
 */
public class SearchBlog {
    private String title;
    private Long typeId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "SearchBlog{" +
                "title='" + title + '\'' +
                ", typeId=" + typeId +
                '}';
    }
}
