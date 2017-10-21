package com.mikespider.springbootMagic.processor;

import com.mikespider.springbootMagic.moniter.ScheduledTask;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

public class Productprocessor implements PageProcessor,ScheduledTask{
    Site site = Site.me().setTimeOut(1000).setSleepTime(1000);
	@Override
	public Site getSite() {
		return site;
	}

	@Override
	public void process(Page page) {
		Selectable select=page.getHtml().xpath("//div[@class='store-header-container']");
		System.out.println(select);
	}

	@Override
	public void excute() {	
		
	}
	
    public static void main(String[] args) {
		Spider.create(new Productprocessor()).addUrl("https://www.aliexpress.com/item/-/32822265859.html").thread(1).run();
	}
}
