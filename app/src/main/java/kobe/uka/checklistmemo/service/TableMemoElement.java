package kobe.uka.checklistmemo.service;

/**
 * Created by uka on 2017/04/27.
 * メモ要素のテーブルクラス
 */

public class TableMemoElement {
    public  static  final String TABLE_NAME = "memo_element";
    public  static  final String COLUMN_ID = "id";
    public  static  final String COLUMN_TEXT = "text";
    public  static  final String COLUMN_CHECK_BOX = "checkbox";
    public  static  final String COLUMN_POSITION = "position";
    public  static  final String COLUMN_DATETIME = "datetime";
    public  static  final String TABLE_CREATE =  "CREATE TABLE " + TABLE_NAME + "(" + COLUMN_ID +  " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_TEXT + " TEXT NOT NULL, " +  COLUMN_CHECK_BOX + " INTEGER NOT NULL,"  +  COLUMN_POSITION + " INTEGER NOT NULL," + COLUMN_DATETIME +  " TEXT NOT NULL);";
}
