package com.cim120.retrofitstudy.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hander on 15/6/18.
 */
public class Top250 implements Serializable{

    private int total;
    private String title;
    private int                  count;
    private List<SubjectsEntity> subjects;
    private int                  start;

    @Override
    public String toString() {
        return "Top250{" +
                "total=" + total +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", subjects=" + subjects +
                ", start=" + start +
                '}';
    }

    public List<SubjectsEntity> getSubjects() {
        return subjects;
    }

    public class SubjectsEntity {

        private String id;
        private String title;
        private List<String> genres;
        private String alt;
        private String subtype;
        private String original_title;
        private ImagesEntity          images;
        private String year;
        private List<CastsEntity> casts;
        private int                   collect_count;
        private RatingEntity          rating;
        private List<DirectorsEntity> directors;

        @Override
        public String toString() {
            return "SubjectsEntity{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", genres=" + genres +
                    ", alt='" + alt + '\'' +
                    ", subtype='" + subtype + '\'' +
                    ", original_title='" + original_title + '\'' +
                    ", images=" + images +
                    ", year='" + year + '\'' +
                    ", casts=" + casts +
                    ", collect_count=" + collect_count +
                    ", rating=" + rating +
                    ", directors=" + directors +
                    '}';
        }

        public ImagesEntity getImages() {
            return images;
        }

        public RatingEntity getRating() {
            return rating;
        }

        public String getTitle() {
            return title;
        }

        public List<String> getGenres() {
            return genres;
        }

        public class ImagesEntity {
            private String small;
            private String medium;
            private String large;

            @Override
            public String toString() {
                return "ImagesEntity{" +
                        "small='" + small + '\'' +
                        ", medium='" + medium + '\'' +
                        ", large='" + large + '\'' +
                        '}';
            }

            public String getSmall() {
                return small;
            }
        }

        public class CastsEntity {
            private String id;
            private String alt;
            private String name;
            private AvatarsEntity avatars;

            @Override
            public String toString() {
                return "CastsEntity{" +
                        "id='" + id + '\'' +
                        ", alt='" + alt + '\'' +
                        ", name='" + name + '\'' +
                        ", avatars=" + avatars +
                        '}';
            }

            public class AvatarsEntity {
                private String small;
                private String medium;
                private String large;

                @Override
                public String toString() {
                    return "AvatarsEntity{" +
                            "small='" + small + '\'' +
                            ", medium='" + medium + '\'' +
                            ", large='" + large + '\'' +
                            '}';
                }
            }
        }

        public class RatingEntity {
            private int min;
            private int    max;
            private String stars;
            private double average;

            @Override
            public String toString() {
                return "RatingEntity{" +
                        "min=" + min +
                        ", max=" + max +
                        ", stars='" + stars + '\'' +
                        ", average=" + average +
                        '}';
            }

            public double getAverage() {
                return average;
            }
        }

        public class DirectorsEntity {
            private String id;
            private String alt;
            private String name;
            private AvatarsEntity avatars;

            @Override
            public String toString() {
                return "DirectorsEntity{" +
                        "id='" + id + '\'' +
                        ", alt='" + alt + '\'' +
                        ", name='" + name + '\'' +
                        ", avatars=" + avatars +
                        '}';
            }

            public class AvatarsEntity {
                private String small;
                private String medium;
                private String large;

                @Override
                public String toString() {
                    return "AvatarsEntity{" +
                            "small='" + small + '\'' +
                            ", medium='" + medium + '\'' +
                            ", large='" + large + '\'' +
                            '}';
                }
            }
        }
    }
}
