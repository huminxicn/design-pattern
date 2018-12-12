package iterator;

import java.util.ArrayList;

/**
 * 这是一个表示书架集合的类，所以实现了 Aggregate 接口。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/6 17:28
 */
public class BookShelf implements Aggregate {
    //这里使用可以自动扩容的 ArrayList 来替代数组来存储 Book。
    private ArrayList<Book> books;

    private int last = 0;

    public BookShelf(int initialSize) {
        this.books = new ArrayList<Book>(initialSize) {
        };
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
