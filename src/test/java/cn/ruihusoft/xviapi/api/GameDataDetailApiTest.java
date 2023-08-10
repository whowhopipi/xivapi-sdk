package cn.ruihusoft.xviapi.api;

import cn.ruihusoft.xviapi.AbstractTest;
import cn.ruihusoft.xviapi.pojo.ItemResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class GameDataDetailApiTest extends AbstractTest {

    private GameDataDetailApi gameDataDetailApi;

    @Before
    public void init() {
        gameDataDetailApi = createApi(GameDataDetailApi.class);
    }

    @Test
    public void testItemDetail() {
        Integer itemId = 10;
        ItemResponse itemResponse = gameDataDetailApi.itemDetail(itemId);

        Assert.assertNotNull(itemResponse);

        log.info("item[{}] detail:{}", itemId, itemResponse);
    }
}