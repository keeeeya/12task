package org.example;

public class Main {

  public static void main(String[] args) {

    // 課題
    // 図書管理システムを作る
    // 書籍（Book）を管理する情報（タイトル、著者、番号）を持つオブジェクト（クラス）を作って、そこに情報を格納する。
    // 図書館（Library）みたいなものを作って、そこにBookをListで持つようなものを保持する。
    // mainメソッドからこのLibraryクラスに対して検索ができるようにする。Libraryクラスは書籍検索機能を持つ。
    // それをmainメソッドから実行して、実行結果をコンソールに出力する。

    Library library = new Library();
    library.search("ト");

  }
}