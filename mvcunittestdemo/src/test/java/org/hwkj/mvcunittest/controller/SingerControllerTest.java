package org.hwkj.mvcunittest.controller;

import org.hwkj.mvcunittest.model.Singer;
import org.hwkj.mvcunittest.model.Singers;
import org.hwkj.mvcunittest.service.SingerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.ExtendedModelMap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author HuWendong
 * @date 2019/5/28 18:05
 */
public class SingerControllerTest {
    private final List<Singer> singers = new ArrayList<>(10);

    @Before
    public void setUp() throws Exception {
        Singer singer = new Singer();
        singer.setId(0L);
        singer.setVersion(0);
        singer.setFirstName("FirstName");
        singer.setLastName("LastName");
        singer.setBirthDate(new Date());
        singer.setCreateTime(new Date());
        singer.setUpdateTime(new Date());
        singers.add(singer);
    }

    @Test
    public void listData() {
        SingerService singerService = mock(SingerService.class);
        when(singerService.findAll()).thenReturn(singers);
        SingerController singerController = new SingerController();
        ReflectionTestUtils.setField(singerController, "singerService", singerService);
        ExtendedModelMap uiModel = new ExtendedModelMap();
        uiModel.addAttribute("singers", singerController.listData());
        Singers singers = (Singers) uiModel.get("singers");
        Assert.assertEquals(1, singers.getSingers().size());
    }
}