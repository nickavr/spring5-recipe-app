package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        category.setId(4L);
        assertThat(category.getId()).isEqualTo();
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}