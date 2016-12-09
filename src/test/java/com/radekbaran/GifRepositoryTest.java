package com.radekbaran;

import com.radekbaran.dao.GifRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GifRepositoryTest {

    @Autowired
    private GifRepository gifRepository;

    @Test
    public void getAllGifs(){
        Assert.assertEquals(6, gifRepository.getAllGifs().size());
    }
}
