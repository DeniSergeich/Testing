import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import seminars.fourth.book.*;
import java.util.ArrayList;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;


public class BookServiceTest {

    InMemoryBookRepository mockBookRepository;
    BookService bookService;
    Book book1 = new Book("1", "Горе от ума", "Достоевский");

    @BeforeEach
    public void setUp() {
        mockBookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(mockBookRepository);
    }

    @Test
    public void testFindId(){
        String bookId = "1";
        when(mockBookRepository.findById("1")).thenReturn(book1);
        assertThat(bookService.findBookById(bookId)).isEqualTo(book1);
        verify(mockBookRepository, times(1)).findById(bookId);
    }

    @Test
    public void testFindAll(){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        when(mockBookRepository.findAll()).thenReturn(books);
        assertThat(bookService.findAllBooks()).isEqualTo(books);
        verify(mockBookRepository, times(1)).findAll();
    }

}
