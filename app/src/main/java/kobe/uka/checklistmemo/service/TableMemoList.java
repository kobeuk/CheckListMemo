package kobe.uka.checklistmemo.service;

/**
 * Created by uka on 2017/04/27.
 * メモリスト用テーブル
 */

public class TableMemoList {
    public  static  final String TABLE_NAME = "memo_list";
    public  static  final String COLUMN_ID = "id";
    public  static  final String COLUMN_TITLE = "title";
    public  static  final String COLUMN_POSITION = "position";
    public  static  final String COLUMN_DATETIME = "datetime";
    public  static  final String TABLE_CREATE =  "CREATE TABLE " + TABLE_NAME + "(" + COLUMN_ID +  " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_TITLE + " TEXT NOT NULL, " +  COLUMN_POSITION + " INTEGER NOT NULL," + COLUMN_DATETIME +  " TEXT NOT NULL);";
}
