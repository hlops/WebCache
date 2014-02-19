package com.hlops.webCache;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: a.karnachuk
 * Date: 2/18/14
 * Time: 4:12 PM
 */
public class WebCacheTest {

    @Test
    public void testName() throws Exception {
        File path = new File("cache");
        path.mkdir();
        final WebCache webCache = new WebCache(path);

        InputStream is = webCache.load(new URL("http://data.nba.com/json/cms/noseason/scoreboard/20101227/games.json"), new WebCacheParams());
        IOUtils.copy(is, System.out);
        is.close();
    }
}
