package org.example;

import java.util.List;

public class Library {

  List<Book> books = List.of(
      new Book("ワンピース", "尾田　栄一郎", 1),
      new Book("鬼滅の刃", "吾峠 呼世晴", 3),
      new Book("呪術廻戦", "芥見 下々", 4),
      new Book("僕のヒーローアカデミア", "堀越 耕平", 5),
      new Book("ワンパンマン", "村田 雄介", 6),
      new Book("ゴールデンカムイ", "野田 サトル", 7),
      new Book("スラムダンク", "井上 雄彦", 8),
      new Book("キングダム", "原 泰久", 9),
      new Book("トリコ", "島袋 光年", 10),
      new Book("ナルト", "岸本 斉史", 11),
      new Book("ドラゴンボール", "鳥山 明", 12),
      new Book("ハイキュー!", "古舘 春一", 13));

  String keyWord;

  public void Seach(String keyWord) {
    this.keyWord = keyWord;
  }


  public void searchResult() {
    List<String> bookList = books.stream()
        .filter(
            result -> result.getTitle().contains(keyWord) || result.getAuthor().contains(keyWord))
        .map(result -> "タイトル：" + result.getTitle() + "　　作者：" + result.getAuthor() + "  No."
            + result.getNumber())
        .toList();

    bookList.forEach(System.out::println);
  }
}
