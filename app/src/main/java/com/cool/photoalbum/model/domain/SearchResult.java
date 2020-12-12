package com.cool.photoalbum.model.domain;

import android.os.Build;
import android.os.Parcel;

import androidx.annotation.RequiresApi;

import com.chad.library.adapter.base.entity.SectionEntity;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    /**
     * isForbiden : null
     * uuid : 45e9410f-acac-42ca-b882-cd5170e3c2dd
     * query : 搜索内容
     * isClusterfilter : true
     * isTinyQcNull : true
     * globalQC : null
     * refineQuery : 搜索内容
     * refineQueryEncode : %CB%D1%CB%F7%C4%DA%C8%DD
     * maxEnd : 2400
     * tc : 2
     * ts : 0,1,2,3
     * showFiltered : false
     * isPornQuery : 0
     * isQcResult : 0
     * startIndex : 0
     * itemsOnPage : 48
     * painter :
     * painter_doc_count : 0
     * video :
     * debug : hitcache:1 query_string:(搜索)(内容) query_debug_rst:0 cache_debug_rst:0.000000 qo_string:{"tquery":0,"related_tags_forbid":"","related_tags_inst":"","related_tags_manual":"","hc":0,"type":0,"format":0,"emo":0,"porn":0,"exp_query":"搜索内容","exp_level":0,"ftquery":"搜索内容","seg":["搜索","内容"],"item_idx":"","sem_query_hash":11394993748313428998,"query_emb":[-0.0305,0.0478,-0.0823,-0.0082,0.0787,0.0563,-0.0361,-0.0124,-0.1103,0.0629,-0.0586,0.091,0.0337,0.0228,0.0182,0.0517,0.0258,-0.0068,0.136,0.0211,-0.0409,0.097,-0.1242,0.0085,-0.0256,0.1415,-0.038,-0.1122,-0.0437,0.0457,-0.1489,0.1507,0.0862,-0.134,-0.0141,-0.0588,-0.064,0.2004,-0.0901,-0.1041,-0.1369,-0.0507,-0.0708,0.0557,0.1692,0.0611,0.0586,-0.086,-0.1431,-0.161,0.0813,-0.0065,0.0511,0.1752,0.0613,0.1141,-0.028,-0.0506,-0.1699,-0.0677,-0.1779,-0.0429,-0.1302,-0.0436,0.0257,0.0998,-0.1015,-0.1304,0.1209,-0.0474,-0.1957,-0.063,0.0346,0.0581,-0.0777,-0.0449,0.0493,0.0091,0.0349,0.0175,0.0725,-0.0049,0.0233,-0.0657,-0.0701,-0.0808,-0.0549,-0.0874,0.1029,0.0203,0.0129,0.0353,-0.1425,0.0385,-0.0724,-0.0965,0.0764,-0.0085,-0.2164,-0.0847,-0.2079,0.1605,0.0795,0.0169,-0.0224,0.0116,-0.0081,-0.0632,0.0484,0.1043,0.0529,0.0683,0.0918,-0.0475,-0.0857,-0.0011,0.048,0.0507,-0.0896,0.0795,-0.0462,0.0545,-0.0418,0.1047,0.1412,0.1412,0.0819,-0.0378],"img_term_weights":[38,32],"q2s_emb":[0.0149,-0.0952,-0.1132,-0.1222,-0.0332,-0.0172,-0.0248,-0.04,-0.0985,-0.0608,-0.1161,-0.0364,-0.0921,0.0888,0.1784,0.044,0.0531,-0.1109,-0.0269,0.1396,0.0804,0.0541,-0.121,-0.0935,0.0667,0.1005,-0.1242,-0.1373,-0.0834,-0.0631,-0.0713,-0.0849,-0.1373,-0.0804,-0.0999,0.0978,-0.0842,0.0185,-0.1182,0.0887,0.0619,-0.1233,0.1157,-0.123,-0.0152,-0.053,0.0449,-0.0829,-0.0287,0.1166,-0.0988,0.1016,0.0726,-0.0315,0.1303,-0.1204,0.0118,-0.1079,-0.0727,-0.0441,0.0108,0.0017,0.0829,0.0228,-0.1443,0.1018,0.0418,0.1287,0.0791,-0.0975,-0.0747,-0.1458,0.0534,-0.0261,-0.1133,-0.0621,-0.1382,-0.0757,-0.1824,-0.0592,0.112,-0.1152,-0.1143,-0.1469,0.0828,-0.1283,0.0541,0.1402,-0.1206,0.1156,-0.0303,-0.0941,0.0479,0.0336,-0.1229,0.0918,-0.1102,0.0758,0.0961,-0.0716,0.0682,-0.0003,0.0303,-0.0326,0.0316,0.0021,-0.0732,0.1273,-0.0198,-0.0414,-0.0949,-0.0009,0.0237,0.0949,0.0066,-0.131,-0.0587,0.086,-0.0461,0.0014,-0.0743,-0.0136,-0.0629,0.0752,0.0824,-0.0697,-0.1114,0.1047],"class_label":0,"qcf_hash":0} qc_string: moreResult:0 recommondTag:TagNum=20,TagTermNum=27,TagStr=搜索(11,752),查找(4,470),内容(3,958),笔记(2,135),sat(2,088),apps(1,334),谷歌(1,303),热度(1,174),百度搜索(934),excel(931),wps表格(878),地摊经济(825),工具(682),替换(680),付费搜索(656),大数据(652),in(609),搜狗(567),ios10.3(560),50005eea_5008b650(552), QueryTime(ms):QueryGroup30(19) QueryGroup20(19) QueryGroup10(28) QueryGroup35(36) QueryGroup25(25) QueryGroup15(21) QueryGroup5(32) QueryGroup34(26) QueryGroup24(21) QueryGroup14(17) QueryGroup4(20) QueryGroup29(20) QueryGroup19(23) QueryGroup9(29) QueryGroup33(22) QueryGroup23(17) QueryGroup13(28) QueryGroup3(22) QueryGroup38(5) QueryGroup28(15) QueryGroup18(25) QueryGroup8(18) QueryGroup32(17) QueryGroup22(31) QueryGroup12(22) QueryGroup2(23) QueryGroup37(5) QueryGroup27(28) QueryGroup17(26) QueryGroup7(24) QueryGroup31(18) QueryGroup21(24) QueryGroup11(20) QueryGroup1(3) QueryGroup36(27) QueryGroup26(19) QueryGroup16(23) Docid->Cluster_id and Ring:288bc7e1f8a8dec8-aa40265391387855-dc79f58f945782fe9384940164070223 -> 30b30b6c3013fff8-a807c704bd5a8c80-3e543c39426c53b22fe50e645b47e015(28a409 34) a07cb0f7f05a72ab-e5c412eeaf388d92-9ec62f33a5f4655adfb81bc64f51c61b -> f2ea956c2e0db02b-cfbd3393b893631d-0278f482995beb5fb0f0fc13095072cf(7ffffff 77) abe1eea3ca79fc28-c577ebdcb0f3dbcc-11cdf1e56859733c3ac17a1b19a1a2aa -> c00fa3ef4ada6214-144ff8f949667ff4-476b0302ece69529b3388556ac33adee(5b65ced 119) c04364e488f2aa52-f4ec3b791f7f0b18-d245da01a95e1d3c1b2307db53ecdb99 -> b3a36dfaa9390fb5-6d8fa47dff0b1b01-fc4b58d1d20a99a5f95e457121245fee(5daed36 106) b4f7182c5244a487-e6df3715707fd1f5-a7a2104c3f543e8b22a23db105ab1b68 -> 872868ba9fe4407c-b9ad61148c92e0c7-46e6153540e281aabe5281f091719bb3(2b76ead 33) c3f2965808c3b79c-abf073fd61dea6bb-97bba111df2647bbc0122fd27e8f7d85 -> 406763204610698a-79b571958ea6f674-cf3baff6639b009d0875730ddb243dd7(5deef77 50) e154002750821088-20370af6263487c0-d300e917a61071a5feb760681fb94b83 -> 6648d771a58c661c-cd5a3d17e92fc03c-14a2a003568198a9431890a38fbf651b(7b6dbb6 44) badRate:0.00 termRate:0.00 EmoType:0
     * tag : ["搜索","查找","内容","笔记","sat","apps","谷歌","热度","百度搜索","excel","wps表格","地摊经济","工具","替换","付费搜索","大数据","in","搜狗","ios10.3"]
     * items : [{"type":-1,"cacheIndex":0,"title":"搜索内容很快","markedTitle":"搜索内容很快","url":null,"summary":null,"markedSummary":null,"size":"30402","date":null,"encoding":null,"time":0,"docid":"04d4aea443b1b51e-68d7b51c89cfaf68-c267a9852e38a151cae25a590394ad31","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/6b4973f90451f052","smallThumbUrl":"https://i02piccdn.sogoucdn.com/6b4973f90451f052_tiny","dataType":"pic","page_url":"http://tech.hexun.com/2011-04-04/128480689.html","pic_url":"http://img.hexun.com/2011-04-04/128480756.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"281","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://img.hexun.com/2011-04-04/128480756.jpg","https_convert":"0","imgkey1":"0648160100040201","imgkey2":"d58b09b197964b4d","imgcolor":"8","hittag":"0","thumb_width":"445","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"对下载进行管理 除了搜索到内容可以进行下载以外,我们还能够对下载内容进行管理,暂停以及删除等,这些都有遥控上面的对应的按键进行设置. 其他网络应用 在以前高清播放机上就常见到的天气、股票等跟人们生活息息相关的应用也在忆捷M900上得到了继承,另","summarypc":"0","mf_id":"6b4973f90451f052","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"和讯科技","painter_year":"","docidx":"0","grpdocs":null,"grpdata":null,"simdata":[["266e6f0264a71f42-989a873bbeec7d4c-841b70b1f41ac0b778cb0ed1abeada79","347","432","88","https://i04piccdn.sogoucdn.com/b94575db0d25e5a3"],["9243fbcd523532c7-691bd291fb470e6c-8dfbef656df6018c619c3743b272653f","587","413","13","https://i01piccdn.sogoucdn.com/8ce28318a732c77a"],["c3f2965808c3b79c-abf073fd61dea6bb-97bba111df2647bbc0122fd27e8f7d85","1024","1024","46","https://i04piccdn.sogoucdn.com/85b82875bcc57c05"],["c04364e488f2aa52-f4ec3b791f7f0b18-d245da01a95e1d3c1b2307db53ecdb99","1790","976","44","https://i01piccdn.sogoucdn.com/d192543cb0ee709c"],["0e0d55ef93578e28-c56a20db2f0912f6-62dd738e6a3e2fa4206b7d8598c1dd06","1200","1064","109","https://i01piccdn.sogoucdn.com/45aecbc861c77a92"],["8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","1266","1069","21","https://i02piccdn.sogoucdn.com/45cd399284b661b6"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://img.hexun.com/2011-04-04/128480756.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜索内容很快","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1515386284","uri":""},{"type":-1,"cacheIndex":1,"title":"搜索者希望马上输入搜索内容","markedTitle":"搜索者希望马上输入搜索内容","url":null,"summary":null,"markedSummary":null,"size":"31663","date":null,"encoding":null,"time":0,"docid":"50d2f8e19304f850-8bb9d7673476e422-f7a7c074e4fe7d93a05c87716a2b6ea0","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/1f04beab535fc986","smallThumbUrl":"https://i04piccdn.sogoucdn.com/1f04beab535fc986_tiny","dataType":"pic","page_url":"http://news.mydrivers.com/1/160/160503.htm","pic_url":"http://img1.mydrivers.com/img/20100406/05585443.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"388","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://img1.mydrivers.com/img/20100406/05585443.jpg","https_convert":"0","imgkey1":"036c1e000000a4e4","imgkey2":"4a800815a58b58de","imgcolor":"134","hittag":"0","thumb_width":"322","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"然而Windows的搜索会先让您选择查找类型,点击 \"所有文件和文件夹\"后才能跳到上面的关键词输入框: 搜索文件时先让您选择搜索类型 有几个人会记得或有明确的或希望去限制搜索类型呢?如果希望马上输入搜索内容,只要设置上图中的的\"改变首选项\",然后\"","summarypc":"0","mf_id":"1f04beab535fc986","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"驱动之家","painter_year":"","docidx":"1","grpdocs":null,"grpdata":null,"simdata":[["288bc7e1f8a8dec8-aa40265391387855-dc79f58f945782fe9384940164070223","500","389","23","https://i03piccdn.sogoucdn.com/6622a01e93dc455b"],["e7d4cac126941b5a-d85d08272a80c21e-eb718b681023360845b17ebfcfa6051b","650","450","115","https://i01piccdn.sogoucdn.com/036c09e42e36a9e0"],["c15845dc66bb5366-4d75e09f38cb0a2a-628078e4a77709506e306ec7b1b78cf6","255","372","90","https://i01piccdn.sogoucdn.com/11c66fb9978aedcd"],["b4f7182c5244a487-e6df3715707fd1f5-fcf64d56bae4b5df2d73ba75a366ef6c","2083","1250","49","https://i04piccdn.sogoucdn.com/29335f22669272df"],["31e992ba604be34c-3bab2b9f5234dfda-8ef5d4b18cc6d4b4ff361733effb62cc","270","480","6","https://i01piccdn.sogoucdn.com/d67f85b5d3a06302"],["87498d72cc4156a1-5dfe41ca84a55235-9b65cac8f77dfe58f9bf74eac6344718","525","436","76","https://i01piccdn.sogoucdn.com/1252a0466a672fbc"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://img1.mydrivers.com/img/20100406/05585443.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜索者希望马上输入搜索内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1569205922","uri":""},{"type":-1,"cacheIndex":2,"title":"清除以前搜索的内容","markedTitle":"清除以前搜索的内容","url":null,"summary":null,"markedSummary":null,"size":"30907","date":null,"encoding":null,"time":0,"docid":"60d2f4fe0275d790-60de8deab87e73ea-efb054bd76f154c9de219d920c5cfc5d","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/b23f9a1afcd76be4","smallThumbUrl":"https://i02piccdn.sogoucdn.com/b23f9a1afcd76be4_tiny","dataType":"pic","page_url":"https://zhidao.baidu.com/question/622076589439844892","pic_url":"http://redirect.sogou.com/proxy?url=aHR0cHM6Ly9nc3MwLmJhaWR1LmNvbS83UG8zZFNhZ194STRraEdrbzlXVEFuRjZoaHkvemhpZGFvL3doJTNENjAwJTJDODAwL3NpZ249MDkyZmUzNzgzNjZkNTVmYmM1OTM3ZTIwNWQxMjYzNzIvYTUwZjRiZmJmYmVkYWI2NDJjZjdjMjY2ZmMzNmFmYzM3ODMxMWU4YS5qcGc=&md5=ab2342dad8bf5a56e6c68283f881fa30","similarUrlFirst":null,"similarUrlSecond":null,"width":"600","height":"311","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://redirect.sogou.com/proxy?url=aHR0cHM6Ly9nc3MwLmJhaWR1LmNvbS83UG8zZFNhZ194STRraEdrbzlXVEFuRjZoaHkvemhpZGFvL3doJTNENjAwJTJDODAwL3NpZ249MDkyZmUzNzgzNjZkNTVmYmM1OTM3ZTIwNWQxMjYzNzIvYTUwZjRiZmJmYmVkYWI2NDJjZjdjMjY2ZmMzNmFmYzM3ODMxMWU4YS5qcGc=&md5=ab2342dad8bf5a56e6c68283f881fa30","https_convert":"0","imgkey1":"07b003ff07ffffff","imgkey2":"2a2aebcefa4d16b3","imgcolor":"231","hittag":"0","thumb_width":"482","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"b23f9a1afcd76be4","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"百度知道","painter_year":"","docidx":"2","grpdocs":null,"grpdata":null,"simdata":[["e5ef5b60d960823f-3dc8e6473e318bc8-a681e7cce6647e6b65080e9c6d24ec42","1080","2160","15","https://i04piccdn.sogoucdn.com/08e8a7a912fcb755"],["d7036c9a17f5fda2-d3197ab23d597bf0-4577cdc0ac5e09f6601469c7140ca11d","1801","3106","25","https://i03piccdn.sogoucdn.com/56403d1f0f0484bd"],["60d2f4fe0275d790-60de8deab87e73ea-8a5cfbe1faf9cc95f4d8c1f0081fb452","600","345","92","https://i02piccdn.sogoucdn.com/b5f7b9ecf3c4cd81"],["3b38a9fb52edbf0d-881d17f98a72741b-6898cc49b84195bf22af2ba2702688b5","1024","875","9","https://i04piccdn.sogoucdn.com/fba746a1a0e8ccac"],["a5c752f8763321f3-98eec54e0c3452d6-19699638f6ebc4db04991a1b26979b15","720","1280","91","https://i04piccdn.sogoucdn.com/315a981256895ca9"],["e8366fd60a39dd7c-c276d64d51bac79f-d25e719558fd09b873676c22aebc89c3","782","992","54","https://i01piccdn.sogoucdn.com/96791f668cadd323"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://gss0.baidu.com/7Po3dSag_xI4khGko9WTAnF6hhy/zhidao/wh%3D600%2C800/sign=092fe378366d55fbc5937e205d126372/a50f4bfbfbedab642cf7c266fc36afc378311e8a.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"清除以前搜索的内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1554489501","uri":""},{"type":-1,"cacheIndex":3,"title":"pdf文件怎么快速查找所需内容","markedTitle":"pdf文件怎么快速查找所需内容","url":null,"summary":null,"markedSummary":null,"size":"58543","date":null,"encoding":null,"time":0,"docid":"179aa7c39428dfb8-d4c53e2b069317b8-c9b08ecdb345d46f7c7ea78572384cc0","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/03e800c0d94b36e7","smallThumbUrl":"https://i04piccdn.sogoucdn.com/03e800c0d94b36e7_tiny","dataType":"pic","page_url":"http://www.pgygho.com/help/soft/20147.html","pic_url":"http://www.pgygho.com/img/allimg/180127/09155Y633_0.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"555","height":"550","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://www.pgygho.com/img/allimg/180127/09155Y633_0.jpg","https_convert":"0","imgkey1":"048c11ff07ffffb6","imgkey2":"9fd7b5ed5aa4a504","imgcolor":"231","hittag":"0","thumb_width":"257","thumb_height":"254","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"5、若是想要将某一内容快速进行替换,也可以在编辑菜单下,点击\"查找与替换\",在弹出的窗口中输入相应文字即可. 2、准备好这个工具后,现在我们打开来,然后把我们需要的PDF文件添加进工具内,操作方法很简单,可以参考如下图示操作: 3、把文件添加进入工","summarypc":"0","mf_id":"03e800c0d94b36e7","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"蒲公英","painter_year":"","docidx":"3","grpdocs":null,"grpdata":null,"simdata":[["a6f1c6d011ec3eb8-ca076c8ce3342ed7-8a125d9f7c540e30747abc7158876027","500","333","116","https://i01piccdn.sogoucdn.com/42e4c8a4ad0fefee"],["cb0914269919bdc6-db2d8f437aa50a85-7d2008c1006fe8135e9bdcd3a800506f","532","476","101","https://i04piccdn.sogoucdn.com/9a73e82a442f4ff2"],["9c055dc8861f32c2-e99b83b14f5785be-163b15ccd9e707b4fdc4f13256afd068","1080","1920","40","https://i01piccdn.sogoucdn.com/7ba698ab956c0512"],["b17c8f01e57d5969-d3492e1ab3bea685-8f80bc8c71a09e482d849a0ac000f0b8","240","427","75","https://i01piccdn.sogoucdn.com/01f6e0171b96647c"],["e222e3d1e5293cd2-560783330e9528a0-68d20923aefcb125da2cd859eeb7b645","500","345","97","https://i02piccdn.sogoucdn.com/75019641145ab6c5"],["c286ca7ecc6f7a79-fd6afc44e6e3634f-7e45363e401f7f9a97063714694acd61","554","402","31","https://i03piccdn.sogoucdn.com/68ffa49e9e94116b"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://www.pgygho.com/img/allimg/180127/09155Y633_0.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"pdf文件怎么快速查找所需内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1517040864","uri":""},{"type":-1,"cacheIndex":4,"title":"搜索文件夹下的内容","markedTitle":"搜索文件夹下的内容","url":null,"summary":null,"markedSummary":null,"size":"34572","date":null,"encoding":null,"time":0,"docid":"13b5d0f75b18a3b6-38a0a5966c48d3f1-c5c3058bba1116b633b5b58af22c6ba0","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/377442f31f6b53e5","smallThumbUrl":"https://i03piccdn.sogoucdn.com/377442f31f6b53e5_tiny","dataType":"pic","page_url":"http://www.3987.com/article/OS/xp/789_2.html","pic_url":"http://www.3987.com/article/UploadPic/2009-11/20091121122419179.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"403","height":"432","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://www.3987.com/article/UploadPic/2009-11/20091121122419179.jpg","https_convert":"0","imgkey1":"03b019ff07fffdb6","imgkey2":"1547ffec5af42351","imgcolor":"231","hittag":"0","thumb_width":"250","thumb_height":"268","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"搜索结果 文件勿动.引用了一个不可用的位置hh\"; 打开该文件打夹时,会弹出错误提示 2.删除该文件打夹,弹出\"无法删除文件:无法读源文件或磁盘\"的错误提示; 文件无法删除 3.搜索该文件打夹下的内容,提示\"搜索完毕,没有结果可以显示\"","summarypc":"0","mf_id":"377442f31f6b53e5","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"统一下载站","painter_year":"","docidx":"4","grpdocs":null,"grpdata":null,"simdata":[["75f49979e1128e6b-828d319750a4bfc5-04c93318471ce6a6b8521943b56391ce","500","380","107","https://i03piccdn.sogoucdn.com/3be69ede114f49cb"],["699bf7cc633628ff-ca2c404122fa1c0d-a2065a4753c2e762e34d42f7d4e67e9c","500","397","18","https://i03piccdn.sogoucdn.com/64fd0de292f8fefd"],["b17c8f01e57d5969-d3492e1ab3bea685-8f80bc8c71a09e482d849a0ac000f0b8","240","427","75","https://i01piccdn.sogoucdn.com/01f6e0171b96647c"],["c15845dc66bb5366-4d75e09f38cb0a2a-65a5bc91e3cb2b71f1d238dfbcef4cde","219","375","71","https://i02piccdn.sogoucdn.com/c4a622a42cb17f2e"],["a07cb0f7f05a72ab-e5c412eeaf388d92-9ec62f33a5f4655adfb81bc64f51c61b","554","283","38","https://i03piccdn.sogoucdn.com/000d42bd57cc6d7e"],["75f49979e1128e6b-828d319750a4bfc5-e1e2dcb3e499155821036358a3a5bc3e","480","235","93","https://i01piccdn.sogoucdn.com/25fa7b07db631140"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://www.3987.com/article/UploadPic/2009-11/20091121122419179.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜索文件夹下的内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1452842724","uri":""},{"type":-1,"cacheIndex":5,"title":"搜狗浏览器百度搜索,搜索内容...","markedTitle":"搜狗浏览器百度搜索,搜索内容...","url":null,"summary":null,"markedSummary":null,"size":"200473","date":null,"encoding":null,"time":0,"docid":"ab735a258a90e8e1-71750041e36633ea-8d4c2565cb296efccb3845ae76914a6a","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/d768f2d8004a7e43","smallThumbUrl":"https://i01piccdn.sogoucdn.com/d768f2d8004a7e43_tiny","dataType":"pic","page_url":"https://bbs.guanjia.qq.com/thread-588299-1-1.html","pic_url":"https://s.pc.qq.com/tousu/img/20190613/526342921_1560392270.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1463","height":"891","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://s.pc.qq.com/tousu/img/20190613/526342921_1560392270.jpg","https_convert":"1","imgkey1":"071c01ff07ffffff","imgkey2":"52e15850c55cdace","imgcolor":"231","hittag":"0","thumb_width":"412","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"搜狗浏览器百度搜索,搜索内容为\"啊\",自动返回主页,网址显示如图.搜索其它内容也都自动返回首页,已经重新卸载安装了浏览器,也清除了浏览器缓存,使用了浏览器修复功能,但问题未能解决. 管家版本:13.4.20317.215","summarypc":"0","mf_id":"d768f2d8004a7e43","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"腾讯电脑管家论坛","painter_year":"","docidx":"5","grpdocs":null,"grpdata":null,"simdata":[["3b38a9fb52edbf0d-881d17f98a72741b-6898cc49b84195bf22af2ba2702688b5","1024","875","9","https://i04piccdn.sogoucdn.com/fba746a1a0e8ccac"],["a5c752f8763321f3-98eec54e0c3452d6-19699638f6ebc4db04991a1b26979b15","720","1280","91","https://i04piccdn.sogoucdn.com/315a981256895ca9"],["18b802f0eb835f7e-458d3f9965d337ba-774129014a8760af77a251d06286999f","559","343","103","https://i04piccdn.sogoucdn.com/974db442bb41ee04"],["c286ca7ecc6f7a79-20ca548bb8b4d644-3483de8425493e856b2865fc3956d156","360","615","22","https://i02piccdn.sogoucdn.com/84e70b28297c9671"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-f0f2e24f20e32f335dceb8d5efbd6fb3","720","386","14","https://i04piccdn.sogoucdn.com/b1191217e17e232c"],["3b38a9fb52edbf0d-881d17f98a72741b-4819b3cd8555fbdd7cde917a35cbfe2e","1200","700","12","https://i02piccdn.sogoucdn.com/bb95f1acac3119b2"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://s.pc.qq.com/tousu/img/20190613/526342921_1560392270.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜狗浏览器百度搜索,搜索内容...","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1563001552","uri":""},{"type":-1,"cacheIndex":6,"title":"360浏览器怎么查找页面内容 查找页面内容方法","markedTitle":"360浏览器怎么查找页面内容 查找页面内容方法","url":null,"summary":null,"markedSummary":null,"size":"25340","date":null,"encoding":null,"time":0,"docid":"31e992ba604be34c-3bab2b9f5234dfda-8ef5d4b18cc6d4b4ff361733effb62cc","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/d67f85b5d3a06302","smallThumbUrl":"https://i01piccdn.sogoucdn.com/d67f85b5d3a06302_tiny","dataType":"pic","page_url":"http://www.liqucn.com/article/838199.shtml","pic_url":"http://images.liqucn.com/img/h98/h51/img_localize_1120b751de0dd224915b7d91a2bca59d_270x480.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"270","height":"480","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://images.liqucn.com/img/h98/h51/img_localize_1120b751de0dd224915b7d91a2bca59d_270x480.jpg","https_convert":"0","imgkey1":"03c019ff04924b2d","imgkey2":"aa38874f1863b43b","imgcolor":"132","hittag":"0","thumb_width":"249","thumb_height":"446","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"在网站里面找东西一页一页翻很麻烦?小伙伴们可以使用页面搜索,输入关键字,你要的内容就出来了,那么怎么搜索页面内容呢?下面就来了解一下360 浏览器 查找页面内容的方法吧.","summarypc":"0","mf_id":"d67f85b5d3a06302","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"历趣","painter_year":"","docidx":"6","grpdocs":null,"grpdata":null,"simdata":[["cb0914269919bdc6-db2d8f437aa50a85-0f5a3e8499c0af4716f1edcf45a6f1bd","528","489","102","https://i04piccdn.sogoucdn.com/1f3d12cf7c2367da"],["c15845dc66bb5366-4d75e09f38cb0a2a-628078e4a77709506e306ec7b1b78cf6","255","372","90","https://i01piccdn.sogoucdn.com/11c66fb9978aedcd"],["31e992ba604be34c-3bab2b9f5234dfda-fc00917446536ace6139efea16dbc484","250","502","83","https://i03piccdn.sogoucdn.com/f9d19ee14da99385"],["82ef04a46cdd6281-db4291939e926f25-7a6e990e01df3adbf6c0ad6559c58348","556","390","64","https://i04piccdn.sogoucdn.com/dca4bee9046bd3af"],["87498d72cc4156a1-5dfe41ca84a55235-9b65cac8f77dfe58f9bf74eac6344718","525","436","76","https://i01piccdn.sogoucdn.com/1252a0466a672fbc"],["d7036c9a17f5fda2-677210b4c6871c9a-025175a838fed4dbc0bda0b789952c67","600","400","17","https://i04piccdn.sogoucdn.com/7a8ee5c1af8f387a"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://images.liqucn.com/img/h98/h51/img_localize_1120b751de0dd224915b7d91a2bca59d_270x480.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"360浏览器怎么查找页面内容 查找页面内容方法","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1517735581","uri":""},{"type":-1,"cacheIndex":7,"title":"如何搜索文档内容","markedTitle":"如何搜索文档内容","url":null,"summary":null,"markedSummary":null,"size":"51786","date":null,"encoding":null,"time":0,"docid":"e222e3d1e5293cd2-0af8e01dc791d1f6-b28183b8a4b0bb6d65df9430e7779091","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/e09e24e8d079cb9f","smallThumbUrl":"https://i02piccdn.sogoucdn.com/e09e24e8d079cb9f_tiny","dataType":"pic","page_url":"http://sh.qihoo.com/pc/9b298c8dfa1f40e13?cota=4&tj_url=xz&sign=360_e39369d1&refer_scene=so_3","pic_url":"http://p8.qhimg.com/t018ee86fc69f5b8465.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"345","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p8.qhimg.com/t018ee86fc69f5b8465.jpg","https_convert":"0","imgkey1":"055815ff06dbffff","imgkey2":"9b30b5b373792474","imgcolor":"231","hittag":"0","thumb_width":"363","thumb_height":"249","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"现在可以进行文档内容搜索了,在搜索栏中输入搜索关键字,便可以搜索出文档标题、地址、大小等信息,而且还可以在右侧预览.","summarypc":"0","mf_id":"e09e24e8d079cb9f","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"360新闻","painter_year":"","docidx":"7","grpdocs":null,"grpdata":null,"simdata":[["cb0914269919bdc6-db2d8f437aa50a85-7d2008c1006fe8135e9bdcd3a800506f","532","476","101","https://i04piccdn.sogoucdn.com/9a73e82a442f4ff2"],["5b5d1540fcc0037a-5d4937b85c3d68d5-896351d1da1f28284e572128f99e6540","494","444","110","https://i01piccdn.sogoucdn.com/181d2827b017dab0"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7d7d7c7edb115aafb552911f6f9fa8f8","554","452","78","https://i04piccdn.sogoucdn.com/8f0489d29f2a58be"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-03b6a44c3cc486189b022b9a659211b3","380","344","98","https://i01piccdn.sogoucdn.com/648de3b625cf3494"],["e222e3d1e5293cd2-253a563d66980634-73d2522edf43c56915f04b50412921d5","500","345","63","https://i02piccdn.sogoucdn.com/05e70dbda4718945"],["60d2f4fe0275d790-60de8deab87e73ea-cbb45889c8e08fef2ed8e3fb05750ee5","500","375","66","https://i04piccdn.sogoucdn.com/48336d5f9cf8b9b2"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p8.qhimg.com/t018ee86fc69f5b8465.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"如何搜索文档内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1559189830","uri":""},{"type":-1,"cacheIndex":8,"title":"设置搜索内容不全","markedTitle":"设置搜索内容不全","url":null,"summary":null,"markedSummary":null,"size":"63392","date":null,"encoding":null,"time":0,"docid":"e5ef5b60d960823f-3dc8e6473e318bc8-b00ec913197340681068441df96218ce","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/24a4e4bdc07cfeff","smallThumbUrl":"https://i01piccdn.sogoucdn.com/24a4e4bdc07cfeff_tiny","dataType":"pic","page_url":"http://bbs.360.cn/thread-15473366-1-1.html","pic_url":"http://p0.qhmsg.com/t01050c46932cdd56cb.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1080","height":"2160","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p0.qhmsg.com/t01050c46932cdd56cb.jpg","https_convert":"0","imgkey1":"074801ff07ffffff","imgkey2":"d5148e71c0b1a709","imgcolor":"234","hittag":"0","thumb_width":"250","thumb_height":"500","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"24a4e4bdc07cfeff","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"360安全社区","painter_year":"","docidx":"8","grpdocs":null,"grpdata":null,"simdata":[["3b38a9fb52edbf0d-881d17f98a72741b-6898cc49b84195bf22af2ba2702688b5","1024","875","9","https://i04piccdn.sogoucdn.com/fba746a1a0e8ccac"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["60d2f4fe0275d790-dd06ad6e3209e998-b52e998695dac8835c706e0a4e4c1c68","500","285","65","https://i04piccdn.sogoucdn.com/2dc4d18dd5801c5b"],["18b802f0eb835f7e-458d3f9965d337ba-774129014a8760af77a251d06286999f","559","343","103","https://i04piccdn.sogoucdn.com/974db442bb41ee04"],["699bf7cc633628ff-4e8c09e6bbe46596-33cda9927d7cfc5a0028f3071cb884b1","245","368","114","https://i03piccdn.sogoucdn.com/2712096f7775e1fa"],["60d2f4fe0275d790-60de8deab87e73ea-8a5cfbe1faf9cc95f4d8c1f0081fb452","600","345","92","https://i02piccdn.sogoucdn.com/b5f7b9ecf3c4cd81"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p0.qhmsg.com/t01050c46932cdd56cb.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"设置搜索内容不全","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1569979644","uri":""},{"type":-1,"cacheIndex":9,"title":"百度搜索内容采集方法","markedTitle":"百度搜索内容采集方法","url":null,"summary":null,"markedSummary":null,"size":"58609","date":null,"encoding":null,"time":0,"docid":"3b38a9fb52edbf0d-881d17f98a72741b-6898cc49b84195bf22af2ba2702688b5","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/fba746a1a0e8ccac","smallThumbUrl":"https://i04piccdn.sogoucdn.com/fba746a1a0e8ccac_tiny","dataType":"pic","page_url":"http://www.bazhuayu.com/tutorial/baidubaike.aspx?t=1","pic_url":"https://www.bazhuayu.com/media/90617/image3.png","similarUrlFirst":null,"similarUrlSecond":null,"width":"1024","height":"875","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://www.bazhuayu.com/media/90617/image3.png","https_convert":"1","imgkey1":"072807ff07ffffff","imgkey2":"158739e7dff4cb45","imgcolor":"231","hittag":"0","thumb_width":"292","thumb_height":"249","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"3、规则制作示例 例如采集百度百科关键词为大梅沙和小梅沙的数据信息,在设置里如下图所示: 任务名:自定义任务名,也可以不设置按照默认的就行 任务组:自定义任务组,也可以不设置按照默认的就行 查看详情:点开可以看到示例网址 任务名:自定义","summarypc":"0","mf_id":"fba746a1a0e8ccac","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"","painter_year":"","docidx":"9","grpdocs":null,"grpdata":null,"simdata":[["60d2f4fe0275d790-dd06ad6e3209e998-b52e998695dac8835c706e0a4e4c1c68","500","285","65","https://i04piccdn.sogoucdn.com/2dc4d18dd5801c5b"],["ab735a258a90e8e1-71750041e36633ea-8d4c2565cb296efccb3845ae76914a6a","1463","891","5","https://i01piccdn.sogoucdn.com/d768f2d8004a7e43"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["3b38a9fb52edbf0d-881d17f98a72741b-4819b3cd8555fbdd7cde917a35cbfe2e","1200","700","12","https://i02piccdn.sogoucdn.com/bb95f1acac3119b2"],["18b802f0eb835f7e-458d3f9965d337ba-774129014a8760af77a251d06286999f","559","343","103","https://i04piccdn.sogoucdn.com/974db442bb41ee04"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://www.bazhuayu.com/media/90617/image3.png","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"百度搜索内容采集方法","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1527752702","uri":""},{"type":-1,"cacheIndex":10,"title":"pdf文件快速查找内容的方法","markedTitle":"pdf文件快速查找内容的方法","url":null,"summary":null,"markedSummary":null,"size":"30545","date":null,"encoding":null,"time":0,"docid":"52bd25aae5328259-39f44a6edd2677ed-37c077cd49d3e57e5150ff7e718508b4","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/e1a9e5021d328ac8","smallThumbUrl":"https://i03piccdn.sogoucdn.com/e1a9e5021d328ac8_tiny","dataType":"pic","page_url":"http://www.7edown.com/ceping/22986_1.html","pic_url":"http://img.7edown.com/upload/2015/5/20/201552010114287494.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"375","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://img.7edown.com/upload/2015/5/20/201552010114287494.jpg","https_convert":"0","imgkey1":"05ac0bff07fffdff","imgkey2":"327bc10c5e42d4b0","imgcolor":"231","hittag":"0","thumb_width":"333","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"4、选择完查找文本之后,鼠标会定位在工具中输入框的位置中,在输入中输入要找的内容. 5、输入完内容之后,例如输入\"学习\",可以点击\"向下搜索\",进行对文件搜索内容.也可以直接回车就可以 6、在文本中输入搜索的内容之后,搜索到内容会直接定位到搜索内容","summarypc":"0","mf_id":"e1a9e5021d328ac8","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"创e下载园","painter_year":"","docidx":"10","grpdocs":null,"grpdata":null,"simdata":[["5b5d1540fcc0037a-5d4937b85c3d68d5-896351d1da1f28284e572128f99e6540","494","444","110","https://i01piccdn.sogoucdn.com/181d2827b017dab0"],["60d2f4fe0275d790-60de8deab87e73ea-8d2435905ae51addd627db715d73cf4a","299","349","87","https://i02piccdn.sogoucdn.com/51570b348c82aa07"],["52bd25aae5328259-39f44a6edd2677ed-c6b38bbde60e7ea1b9c4bff6a39bc8e1","486","534","30","https://i02piccdn.sogoucdn.com/d30438a18255926d"],["60d2f4fe0275d790-60de8deab87e73ea-5863c4d5aa925ac5b4131bac4dc79892","387","441","27","https://i02piccdn.sogoucdn.com/ac6e12e9954ef59e"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-03b6a44c3cc486189b022b9a659211b3","380","344","98","https://i01piccdn.sogoucdn.com/648de3b625cf3494"],["60d2f4fe0275d790-60de8deab87e73ea-cbb45889c8e08fef2ed8e3fb05750ee5","500","375","66","https://i04piccdn.sogoucdn.com/48336d5f9cf8b9b2"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://img.7edown.com/upload/2015/5/20/201552010114287494.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"pdf文件快速查找内容的方法","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1579086688","uri":""},{"type":-1,"cacheIndex":11,"title":"搜索的内容求更新","markedTitle":"搜索的内容求更新","url":null,"summary":null,"markedSummary":null,"size":"57111","date":null,"encoding":null,"time":0,"docid":"e5ef5b60d960823f-3dc8e6473e318bc8-cab6af6a34fa0d76db1976d942873457","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/bdff1e430a9ae1a9","smallThumbUrl":"https://i03piccdn.sogoucdn.com/bdff1e430a9ae1a9_tiny","dataType":"pic","page_url":"http://bbs.360.cn/thread-14853101-1-1.html","pic_url":"http://p0.qhmsg.com/t010dad55433442774b.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"967","height":"437","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p0.qhmsg.com/t010dad55433442774b.jpg","https_convert":"0","imgkey1":"051013ff07ff7fff","imgkey2":"d5c77aea87b44bcf","imgcolor":"231","hittag":"0","thumb_width":"552","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"bdff1e430a9ae1a9","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"360安全社区","painter_year":"","docidx":"11","grpdocs":null,"grpdata":null,"simdata":[["e5ef5b60d960823f-3dc8e6473e318bc8-91cd33db3bdb05bf15b445f1f6ef187a","761","390","29","https://i04piccdn.sogoucdn.com/8a2e7a72a43f6a36"],["60d2f4fe0275d790-60de8deab87e73ea-0505cceaa60ec3f018eb9bd16c6e1abd","600","419","62","https://i01piccdn.sogoucdn.com/64bf8c211c841b38"],["9c055dc8861f32c2-e99b83b14f5785be-25a8591171910d68664e4eb48f13f17b","1080","1920","39","https://i01piccdn.sogoucdn.com/6aab4191bb3c13fb"],["179aa7c39428dfb8-d4c53e2b069317b8-690c87a453146990592dd346afc654ce","500","360","105","https://i01piccdn.sogoucdn.com/76c78658df801cff"],["996e207fbabdc26c-4ad0d1f35585816c-6250df9711e803033de0478c37e7433f","590","383","111","https://i04piccdn.sogoucdn.com/e47138f81472117b"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-03b6a44c3cc486189b022b9a659211b3","380","344","98","https://i01piccdn.sogoucdn.com/648de3b625cf3494"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p0.qhmsg.com/t010dad55433442774b.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜索的内容求更新","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1569541981","uri":""},{"type":-1,"cacheIndex":12,"title":"百度搜索内容采集方法","markedTitle":"百度搜索内容采集方法","url":null,"summary":null,"markedSummary":null,"size":"76819","date":null,"encoding":null,"time":0,"docid":"3b38a9fb52edbf0d-881d17f98a72741b-4819b3cd8555fbdd7cde917a35cbfe2e","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/bb95f1acac3119b2","smallThumbUrl":"https://i02piccdn.sogoucdn.com/bb95f1acac3119b2_tiny","dataType":"pic","page_url":"http://www.bazhuayu.com/tutorial/baidubaike.aspx?t=1","pic_url":"https://www.bazhuayu.com/media/90642/image8.png","similarUrlFirst":null,"similarUrlSecond":null,"width":"1200","height":"700","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://www.bazhuayu.com/media/90642/image8.png","https_convert":"1","imgkey1":"06fc07ff07ffffff","imgkey2":"9a5b5ecdcf24e3db","imgcolor":"231","hittag":"0","thumb_width":"429","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"7、然后选择文件存放在电脑上的路径,路径选择好之后选择保存 8、这样数据就被完整的导出到自己的电脑上来了哦 6、采集完毕之后选择导出数据按钮即可,这里以导出excel2007为例,选择这个选项之后点击确定","summarypc":"0","mf_id":"bb95f1acac3119b2","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"","painter_year":"","docidx":"12","grpdocs":null,"grpdata":null,"simdata":[["3b38a9fb52edbf0d-881d17f98a72741b-6898cc49b84195bf22af2ba2702688b5","1024","875","9","https://i04piccdn.sogoucdn.com/fba746a1a0e8ccac"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["c286ca7ecc6f7a79-20ca548bb8b4d644-3483de8425493e856b2865fc3956d156","360","615","22","https://i02piccdn.sogoucdn.com/84e70b28297c9671"],["ab735a258a90e8e1-71750041e36633ea-8d4c2565cb296efccb3845ae76914a6a","1463","891","5","https://i01piccdn.sogoucdn.com/d768f2d8004a7e43"],["9fc097932c179cba-33a593c239cbcf30-1cebc5dcb386fac20ef86131e056b007","1920","1042","26","https://i03piccdn.sogoucdn.com/6a7343530ee7705e"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://www.bazhuayu.com/media/90642/image8.png","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"百度搜索内容采集方法","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1577844856","uri":""},{"type":-1,"cacheIndex":13,"title":"亿愿pdf内容搜索工具界面预览 亿愿pdf内容搜索工具界面图片","markedTitle":"亿愿pdf内容搜索工具界面预览 亿愿pdf内容搜索工具界面图片","url":null,"summary":null,"markedSummary":null,"size":"21700","date":null,"encoding":null,"time":0,"docid":"9243fbcd523532c7-691bd291fb470e6c-8dfbef656df6018c619c3743b272653f","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/8ce28318a732c77a","smallThumbUrl":"https://i01piccdn.sogoucdn.com/8ce28318a732c77a_tiny","dataType":"pic","page_url":"http://count.crsky.com/Viewimg.aspx?id=109324","pic_url":"https://pic.crsky.com/uploadfiles/201608/2016080214521373.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"587","height":"413","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://pic.crsky.com/uploadfiles/201608/2016080214521373.jpg","https_convert":"1","imgkey1":"05f8096d05b6db6d","imgkey2":"408000100080000a","imgcolor":"128","hittag":"0","thumb_width":"356","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"软件介绍:亿愿PDF内容搜索工具是一款PDF内容搜索工具,能够在不打开PDF文档下搜索文档中的内容,可以在多个文档中搜索,还支持PDF转txt文本的功能.","summarypc":"0","mf_id":"8ce28318a732c77a","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"非凡软件站","painter_year":"","docidx":"13","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-755becdefb2ac745bfa29dad9fb145e6","1024","768","53","https://i02piccdn.sogoucdn.com/a945908a7c644819"],["c04364e488f2aa52-f4ec3b791f7f0b18-d245da01a95e1d3c1b2307db53ecdb99","1790","976","44","https://i01piccdn.sogoucdn.com/d192543cb0ee709c"],["37e5193208fcc6bb-7108060c32761742-9f8e43836ce28a8f4f450ded80d2ca36","700","402","74","https://i04piccdn.sogoucdn.com/a91a4bf09061717e"],["c3f2965808c3b79c-abf073fd61dea6bb-97bba111df2647bbc0122fd27e8f7d85","1024","1024","46","https://i04piccdn.sogoucdn.com/85b82875bcc57c05"],["b72583a21fce50e8-de9c9f897ce7559e-af8d1b6e786a1d1dba1458e73dd263dd","1210","750","61","https://i02piccdn.sogoucdn.com/a7999c5a676e72ff"],["60d2f4fe0275d790-60de8deab87e73ea-5863c4d5aa925ac5b4131bac4dc79892","387","441","27","https://i02piccdn.sogoucdn.com/ac6e12e9954ef59e"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://pic.crsky.com/uploadfiles/201608/2016080214521373.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"亿愿pdf内容搜索工具界面预览 亿愿pdf内容搜索工具界面图片","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1544501164","uri":""},{"type":-1,"cacheIndex":14,"title":"点击【搜索历史】中检索历史,可以直接使用历史搜索内容进行搜索.","markedTitle":"点击【搜索历史】中检索历史,可以直接使用历史搜索内容进行搜索.","url":null,"summary":null,"markedSummary":null,"size":"252859","date":null,"encoding":null,"time":0,"docid":"abe1eea3ca79fc28-c577ebdcb0f3dbcc-f0f2e24f20e32f335dceb8d5efbd6fb3","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/b1191217e17e232c","smallThumbUrl":"https://i04piccdn.sogoucdn.com/b1191217e17e232c_tiny","dataType":"pic","page_url":"https://www.sohu.com/a/383808337_120133631","pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20200328/da6f5c9aeffc4872ad3deafaa91bfafc.gif","similarUrlFirst":null,"similarUrlSecond":null,"width":"720","height":"386","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20200328/da6f5c9aeffc4872ad3deafaa91bfafc.gif","https_convert":"0","imgkey1":"071401ff07ffffff","imgkey2":"caf8d191912914a4","imgcolor":"231","hittag":"0","thumb_width":"720","thumb_height":"386","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"点击【重置】按钮,可以重新选择搜索内容. 点击【取消】按钮,可以关闭搜索框. 在文件管理区选择本地或KingDraw Cloud确定搜索路径,然后点击左上方【结构搜索】按钮,会进入搜索界面. 点击【搜索选中结构】按钮,并在画板中框选相应结构,点","summarypc":"0","mf_id":"b1191217e17e232c","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":1,"gifpic":1,"ch_site_name":"搜狐网","painter_year":"","docidx":"14","grpdocs":null,"grpdata":null,"simdata":[["a5c752f8763321f3-98eec54e0c3452d6-19699638f6ebc4db04991a1b26979b15","720","1280","91","https://i04piccdn.sogoucdn.com/315a981256895ca9"],["ab735a258a90e8e1-71750041e36633ea-8d4c2565cb296efccb3845ae76914a6a","1463","891","5","https://i01piccdn.sogoucdn.com/d768f2d8004a7e43"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"],["699bf7cc633628ff-4e8c09e6bbe46596-33cda9927d7cfc5a0028f3071cb884b1","245","368","114","https://i03piccdn.sogoucdn.com/2712096f7775e1fa"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://5b0988e595225.cdn.sohucs.com/images/20200328/da6f5c9aeffc4872ad3deafaa91bfafc.gif","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"点击【搜索历史】中检索历史,可以直接使用历史搜索内容进行搜索.","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1585388689","uri":""},{"type":-1,"cacheIndex":15,"title":"设置搜索内容不全","markedTitle":"设置搜索内容不全","url":null,"summary":null,"markedSummary":null,"size":"25729","date":null,"encoding":null,"time":0,"docid":"e5ef5b60d960823f-3dc8e6473e318bc8-a681e7cce6647e6b65080e9c6d24ec42","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/08e8a7a912fcb755","smallThumbUrl":"https://i04piccdn.sogoucdn.com/08e8a7a912fcb755_tiny","dataType":"pic","page_url":"http://bbs.360.cn/thread-15473366-1-1.html","pic_url":"http://p0.qhmsg.com/t01ad19aba21960abae.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1080","height":"2160","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p0.qhmsg.com/t01ad19aba21960abae.jpg","https_convert":"0","imgkey1":"07c801ff07ffffff","imgkey2":"002a80805a620000","imgcolor":"234","hittag":"0","thumb_width":"250","thumb_height":"500","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"08e8a7a912fcb755","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"360安全社区","painter_year":"","docidx":"15","grpdocs":null,"grpdata":null,"simdata":[["3b38a9fb52edbf0d-881d17f98a72741b-6898cc49b84195bf22af2ba2702688b5","1024","875","9","https://i04piccdn.sogoucdn.com/fba746a1a0e8ccac"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["c286ca7ecc6f7a79-20ca548bb8b4d644-3483de8425493e856b2865fc3956d156","360","615","22","https://i02piccdn.sogoucdn.com/84e70b28297c9671"],["ab735a258a90e8e1-71750041e36633ea-8d4c2565cb296efccb3845ae76914a6a","1463","891","5","https://i01piccdn.sogoucdn.com/d768f2d8004a7e43"],["9fc097932c179cba-33a593c239cbcf30-1cebc5dcb386fac20ef86131e056b007","1920","1042","26","https://i03piccdn.sogoucdn.com/6a7343530ee7705e"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p0.qhmsg.com/t01ad19aba21960abae.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"设置搜索内容不全","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1569979644","uri":""},{"type":-1,"cacheIndex":16,"title":"只要按住语音键,说出想搜索的内容,搜索框中则自动将语音转化为文字,随后便出现搜索内容.","markedTitle":"只要按住语音键,说出想搜索的内容,搜索框中则自动将语音转化为文字,随后便出现搜索内容.","url":null,"summary":null,"markedSummary":null,"size":"19542","date":null,"encoding":null,"time":0,"docid":"abe1eea3ca79fc28-c577ebdcb0f3dbcc-521fb4fd29a39ca57138d1a2d40c8077","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/a98e03b8907ed518","smallThumbUrl":"https://i02piccdn.sogoucdn.com/a98e03b8907ed518_tiny","dataType":"pic","page_url":"http://www.sohu.com/a/284585196_100002886","pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20181226/d5d71b6280e545948884704aa490c9eb.jpeg","similarUrlFirst":null,"similarUrlSecond":null,"width":"273","height":"561","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20181226/d5d71b6280e545948884704aa490c9eb.jpeg","https_convert":"0","imgkey1":"05cc11ff07ffffff","imgkey2":"5f53d5a71f042f90","imgcolor":"231","hittag":"0","thumb_width":"273","thumb_height":"561","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"3、微信内可语音搜索内容. 在之前版本的微信中,只允许用户在搜索框内进行文字搜索,7.0版本中出现\"语音\"功能键: 用户只要按住语音键,说出想搜索的内容,搜索框中则自动将语音转化为文字,稍后便出现搜索内容. 视频生产入口: 添加表情、文字、","summarypc":"0","mf_id":"a98e03b8907ed518","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"搜狐网","painter_year":"","docidx":"16","grpdocs":null,"grpdata":null,"simdata":[["179aa7c39428dfb8-d4c53e2b069317b8-d887667b6a3105738d7c19d5dabb8c0d","396","463","77","https://i04piccdn.sogoucdn.com/fdf64e2c13b69f6c"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-03b6a44c3cc486189b022b9a659211b3","380","344","98","https://i01piccdn.sogoucdn.com/648de3b625cf3494"],["52bd25aae5328259-39f44a6edd2677ed-c6b38bbde60e7ea1b9c4bff6a39bc8e1","486","534","30","https://i02piccdn.sogoucdn.com/d30438a18255926d"],["5b5d1540fcc0037a-5d4937b85c3d68d5-896351d1da1f28284e572128f99e6540","494","444","110","https://i01piccdn.sogoucdn.com/181d2827b017dab0"],["dc2b08b5a1471896-b323379cd0653b16-af3f70cb3abd54816b989e01ab0b7c3e","500","338","112","https://i02piccdn.sogoucdn.com/2cc36cb2e7e4c266"],["60d2f4fe0275d790-60de8deab87e73ea-addf51f11ddcdab0b909f330d1a9c616","491","404","68","https://i01piccdn.sogoucdn.com/1664b7e3c32a1182"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://5b0988e595225.cdn.sohucs.com/images/20181226/d5d71b6280e545948884704aa490c9eb.jpeg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"只要按住语音键,说出想搜索的内容,搜索框中则自动将语音转化为文字,随后便出现搜索内容.","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1567595831","uri":""},{"type":-1,"cacheIndex":17,"title":"微信对话框上线搜一搜功能","markedTitle":"微信对话框上线搜一搜功能","url":null,"summary":null,"markedSummary":null,"size":"55753","date":null,"encoding":null,"time":0,"docid":"d7036c9a17f5fda2-677210b4c6871c9a-025175a838fed4dbc0bda0b789952c67","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/7a8ee5c1af8f387a","smallThumbUrl":"https://i04piccdn.sogoucdn.com/7a8ee5c1af8f387a_tiny","dataType":"pic","page_url":"https://tech.sina.com.cn/roll/2020-09-09/doc-iivhuipp3386626.shtml","pic_url":"http://n.sinaimg.cn/spider202099/200/w600h400/20200909/f492-iyywcsy8013404.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"600","height":"400","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://n.sinaimg.cn/spider202099/200/w600h400/20200909/f492-iyywcsy8013404.jpg","https_convert":"0","imgkey1":"045403ff06da4924","imgkey2":"325a860d2c40b43b","imgcolor":"231","hittag":"0","thumb_width":"500","thumb_height":"333","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"微信团队透露,该功能将在今天下午或者稍晚时候全量上线. 微信搜一搜产品运营总监梁泽锋在接受国内媒体采访时表示,微信对于搜一搜的边界定义很宽广,没有边界.并且,搜一搜是开放的, 不仅仅可以搜索内部的资源、内容和服务,也逐步支持搜索外部的内容 全量","summarypc":"0","mf_id":"7a8ee5c1af8f387a","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"新浪科技","painter_year":"","docidx":"17","grpdocs":null,"grpdata":null,"simdata":[["31e992ba604be34c-3bab2b9f5234dfda-8ef5d4b18cc6d4b4ff361733effb62cc","270","480","6","https://i01piccdn.sogoucdn.com/d67f85b5d3a06302"],["cb0914269919bdc6-db2d8f437aa50a85-0f5a3e8499c0af4716f1edcf45a6f1bd","528","489","102","https://i04piccdn.sogoucdn.com/1f3d12cf7c2367da"],["e154002750821088-20370af6263487c0-d300e917a61071a5feb760681fb94b83","1280","800","47","https://i02piccdn.sogoucdn.com/db76a1243d97e233"],["87498d72cc4156a1-5dfe41ca84a55235-9b65cac8f77dfe58f9bf74eac6344718","525","436","76","https://i01piccdn.sogoucdn.com/1252a0466a672fbc"],["c286ca7ecc6f7a79-fd6afc44e6e3634f-7e45363e401f7f9a97063714694acd61","554","402","31","https://i03piccdn.sogoucdn.com/68ffa49e9e94116b"],["c15845dc66bb5366-4d75e09f38cb0a2a-65a5bc91e3cb2b71f1d238dfbcef4cde","219","375","71","https://i02piccdn.sogoucdn.com/c4a622a42cb17f2e"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://n.sinaimg.cn/spider202099/200/w600h400/20200909/f492-iyywcsy8013404.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"微信对话框上线搜一搜功能","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1599668122","uri":""},{"type":-1,"cacheIndex":18,"title":"查看更多搜索内容","markedTitle":"查看更多搜索内容","url":null,"summary":null,"markedSummary":null,"size":"62626","date":null,"encoding":null,"time":0,"docid":"699bf7cc633628ff-ca2c404122fa1c0d-a2065a4753c2e762e34d42f7d4e67e9c","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/64fd0de292f8fefd","smallThumbUrl":"https://i03piccdn.sogoucdn.com/64fd0de292f8fefd_tiny","dataType":"pic","page_url":"http://tech.hexun.com/2011-09-21/133578043.html","pic_url":"http://i2.hexunimg.cn/2011-09-21/133578045.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"397","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://i2.hexunimg.cn/2011-09-21/133578045.jpg","https_convert":"0","imgkey1":"040c2fff07fbedad","imgkey2":"15c73e60c6f40343","imgcolor":"7","hittag":"0","thumb_width":"313","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"另外,如果用户发现在下拉的关键词相关的资源中都没有想要的内容,我们可以点击\"查看更多\"来进行更多内容的查找. 当用户点选了\"查看更多\"时,此时页面跳转入关键词\"变形金刚\"搜索的总列表内,在这里,用户可以查找到更多更详细的片源,我们看到同时出现了有变形金","summarypc":"0","mf_id":"64fd0de292f8fefd","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"和讯科技","painter_year":"","docidx":"18","grpdocs":null,"grpdata":null,"simdata":[["13b5d0f75b18a3b6-38a0a5966c48d3f1-c5c3058bba1116b633b5b58af22c6ba0","403","432","4","https://i03piccdn.sogoucdn.com/377442f31f6b53e5"],["179aa7c39428dfb8-d4c53e2b069317b8-c9b08ecdb345d46f7c7ea78572384cc0","555","550","3","https://i04piccdn.sogoucdn.com/03e800c0d94b36e7"],["c286ca7ecc6f7a79-fd6afc44e6e3634f-7e45363e401f7f9a97063714694acd61","554","402","31","https://i03piccdn.sogoucdn.com/68ffa49e9e94116b"],["c15845dc66bb5366-4d75e09f38cb0a2a-65a5bc91e3cb2b71f1d238dfbcef4cde","219","375","71","https://i02piccdn.sogoucdn.com/c4a622a42cb17f2e"],["b17c8f01e57d5969-d3492e1ab3bea685-8f80bc8c71a09e482d849a0ac000f0b8","240","427","75","https://i01piccdn.sogoucdn.com/01f6e0171b96647c"],["31e992ba604be34c-08fbb683bff01adf-4b230a224ccee97c33e06357951b9830","270","479","95","https://i01piccdn.sogoucdn.com/a416b382fecf4a4d"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://i2.hexunimg.cn/2011-09-21/133578045.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"查看更多搜索内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1520496685","uri":""},{"type":-1,"cacheIndex":19,"title":"用搜搜引擎搜索内容打不开 Chrome 浏览器讨论区","markedTitle":"用搜搜引擎搜索内容打不开 Chrome 浏览器讨论区","url":null,"summary":null,"markedSummary":null,"size":"56177","date":null,"encoding":null,"time":0,"docid":"ebe0f9f20c3e5036-3fb5aee8a10dda83-786daa1e2e8d40c76670f1841b30acdd","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/76432724cc98b8cb","smallThumbUrl":"https://i04piccdn.sogoucdn.com/76432724cc98b8cb_tiny","dataType":"pic","page_url":"http://bbs.kafan.cn/thread-1411407-1-1.html","pic_url":"https://fj.ikafan.com/attachment/forum/201211/15/153815r2lvhibl70e0r2el.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1353","height":"887","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"https://fj.ikafan.com/attachment/forum/201211/15/153815r2lvhibl70e0r2el.jpg","https_convert":"0","imgkey1":"070011be06fb7dbe","imgkey2":"002280004a400008","imgcolor":"134","hittag":"0","thumb_width":"381","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"chrome昨天就开始这样,搜索内容就一直在缓冲,根本看不了内容,像网站围脖这样的倒是能开,从搜索引擎搜索内容,打不开 就像这样 特立独行者","summarypc":"0","mf_id":"76432724cc98b8cb","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"卡饭论坛","painter_year":"","docidx":"19","grpdocs":null,"grpdata":null,"simdata":[["e8366fd60a39dd7c-c276d64d51bac79f-d25e719558fd09b873676c22aebc89c3","782","992","54","https://i01piccdn.sogoucdn.com/96791f668cadd323"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["a5c752f8763321f3-98eec54e0c3452d6-19699638f6ebc4db04991a1b26979b15","720","1280","91","https://i04piccdn.sogoucdn.com/315a981256895ca9"],["699bf7cc633628ff-4e8c09e6bbe46596-33cda9927d7cfc5a0028f3071cb884b1","245","368","114","https://i03piccdn.sogoucdn.com/2712096f7775e1fa"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://fj.ikafan.com/attachment/forum/201211/15/153815r2lvhibl70e0r2el.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"用搜搜引擎搜索内容打不开 Chrome 浏览器讨论区","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1514957115","uri":""},{"type":-1,"cacheIndex":20,"title":"更多搜索内容","markedTitle":"更多搜索内容","url":null,"summary":null,"markedSummary":null,"size":"49863","date":null,"encoding":null,"time":0,"docid":"699bf7cc633628ff-7652b36ba6945424-2ea3018d7816de99613ef3bb53762d59","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/d7c81b36f95ac85a","smallThumbUrl":"https://i02piccdn.sogoucdn.com/d7c81b36f95ac85a_tiny","dataType":"pic","page_url":"http://tech.hexun.com/2011-09-21/133578043.html","pic_url":"http://i8.hexunimg.cn/2011-09-21/133578046.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"404","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://i8.hexunimg.cn/2011-09-21/133578046.jpg","https_convert":"0","imgkey1":"064405ff07ffffb6","imgkey2":"05fe3e698f32a3ba","imgcolor":"7","hittag":"0","thumb_width":"311","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"当用户点选了\"查看更多\"时,此时页面跳转入关键词\"变形金刚\"搜索的总列表内,在这里,用户可以查找到更多更详细的片源,我们看到同时出现了有变形金刚3、变形金刚动画片以及变形金刚1等等,同时列出了具体上映的时间这些,这样为用户更准确和快捷地找到目标资源提供了很","summarypc":"0","mf_id":"d7c81b36f95ac85a","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"和讯科技","painter_year":"","docidx":"20","grpdocs":null,"grpdata":null,"simdata":[["8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","1266","1069","21","https://i02piccdn.sogoucdn.com/45cd399284b661b6"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["60d2f4fe0275d790-60de8deab87e73ea-addf51f11ddcdab0b909f330d1a9c616","491","404","68","https://i01piccdn.sogoucdn.com/1664b7e3c32a1182"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7bdd091e78adcdfc5566e1914ab7219b","1082","1561","32","https://i01piccdn.sogoucdn.com/40562c4b81bac5e6"],["c286ca7ecc6f7a79-20248c558009c911-3060c721b1eb5ea2955322f86f99f680","540","960","56","https://i03piccdn.sogoucdn.com/a03cc6ad9147fd7b"],["9fc097932c179cba-33a593c239cbcf30-cab92b8f3937c0b62e9f0b76be141302","725","514","57","https://i03piccdn.sogoucdn.com/0f5ec0075fac5e59"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://i8.hexunimg.cn/2011-09-21/133578046.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"更多搜索内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1518521370","uri":""},{"type":-1,"cacheIndex":21,"title":"应用宝 内容外显 能力大升级 成为 最懂用户 的应用商店","markedTitle":"应用宝 内容外显 能力大升级 成为 最懂用户 的应用商店","url":null,"summary":null,"markedSummary":null,"size":"469690","date":null,"encoding":null,"time":0,"docid":"8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/45cd399284b661b6","smallThumbUrl":"https://i02piccdn.sogoucdn.com/45cd399284b661b6_tiny","dataType":"pic","page_url":"http://www.ciotimes.com/IT/124629.html","pic_url":"http://www.ciotimes.com/uploadfile/2017/0224/20170224032721520.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1266","height":"1069","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://www.ciotimes.com/uploadfile/2017/0224/20170224032721520.jpg","https_convert":"0","imgkey1":"065c09ff07fffff6","imgkey2":"bf0a142174d6b768","imgcolor":"231","hittag":"0","thumb_width":"295","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"在用户搜索场景中,新版应用宝也对其\"内容外显\"也进行了深度优化.用户可任意在应用宝搜索框内搜索自身需求,如搜索\"吃饭\",便可查阅到推荐\"饿了么\"\"ENJOY\"等吃饭的APP、还能浏览到果壳精选、知乎、春雨医生等应用中关于\"吃饭\"的文章和小知识,满足用户关于","summarypc":"0","mf_id":"45cd399284b661b6","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"CIO时代网","painter_year":"","docidx":"21","grpdocs":null,"grpdata":null,"simdata":[["95c435a20586d145-208298664a9952f8-d6dde712e8c180886d6fb7a7cb46adec","2280","1950","42","https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9"],["9fc097932c179cba-33a593c239cbcf30-cab92b8f3937c0b62e9f0b76be141302","725","514","57","https://i03piccdn.sogoucdn.com/0f5ec0075fac5e59"],["699bf7cc633628ff-7652b36ba6945424-2ea3018d7816de99613ef3bb53762d59","500","404","20","https://i02piccdn.sogoucdn.com/d7c81b36f95ac85a"],["60d2f4fe0275d790-60de8deab87e73ea-addf51f11ddcdab0b909f330d1a9c616","491","404","68","https://i01piccdn.sogoucdn.com/1664b7e3c32a1182"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["c286ca7ecc6f7a79-20248c558009c911-3060c721b1eb5ea2955322f86f99f680","540","960","56","https://i03piccdn.sogoucdn.com/a03cc6ad9147fd7b"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://www.ciotimes.com/uploadfile/2017/0224/20170224032721520.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"应用宝 内容外显 能力大升级 成为 最懂用户 的应用商店","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1578940013","uri":""},{"type":-1,"cacheIndex":22,"title":"搜索指定内容 朋友圈圈文章公众号 微信搜索 安卓每日推送 t 国 分词 def abc 4 ghl jkl mno重输 pqrs tuv wxyz 0 搜索 符 123 中/英","markedTitle":"搜索指定内容 朋友圈圈文章公众号 微信搜索 安卓每日推送 t 国 分词 def abc 4 ghl jkl mno重输 pqrs tuv wxyz 0 搜索 符 123 中/英","url":null,"summary":null,"markedSummary":null,"size":"884564","date":null,"encoding":null,"time":0,"docid":"c286ca7ecc6f7a79-20ca548bb8b4d644-3483de8425493e856b2865fc3956d156","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/84e70b28297c9671","smallThumbUrl":"https://i02piccdn.sogoucdn.com/84e70b28297c9671_tiny","dataType":"pic","page_url":"http://www.twoeggz.com/news/711508.html","pic_url":"http://p9.pstatp.com/large/1b870002ae2c171d2c68","similarUrlFirst":null,"similarUrlSecond":null,"width":"360","height":"615","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p9.pstatp.com/large/1b870002ae2c171d2c68","https_convert":"0","imgkey1":"06d003ff07ffffff","imgkey2":"f1db5218850dcb5b","imgcolor":"231","hittag":"0","thumb_width":"250","thumb_height":"428","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"84e70b28297c9671","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":1,"gifpic":0,"ch_site_name":"蛋蛋赞","painter_year":"","docidx":"22","grpdocs":null,"grpdata":null,"simdata":[["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["3b38a9fb52edbf0d-881d17f98a72741b-4819b3cd8555fbdd7cde917a35cbfe2e","1200","700","12","https://i02piccdn.sogoucdn.com/bb95f1acac3119b2"],["ab735a258a90e8e1-71750041e36633ea-8d4c2565cb296efccb3845ae76914a6a","1463","891","5","https://i01piccdn.sogoucdn.com/d768f2d8004a7e43"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p9.pstatp.com/large/1b870002ae2c171d2c68","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜索指定内容 朋友圈圈文章公众号 微信搜索 安卓每日推送 t 国 分词 def abc 4 ghl jkl mno重输 pqrs tuv wxyz 0 搜索 符 123 中/英","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1545394880","uri":""},{"type":-1,"cacheIndex":23,"title":"搜索争夺原创内容 搜狗接入知乎两千万专业问答知识","markedTitle":"搜索争夺原创内容 搜狗接入知乎两千万专业问答知识","url":null,"summary":null,"markedSummary":null,"size":"31283","date":null,"encoding":null,"time":0,"docid":"288bc7e1f8a8dec8-aa40265391387855-dc79f58f945782fe9384940164070223","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/c77940dd5aa2e807","smallThumbUrl":"https://i03piccdn.sogoucdn.com/c77940dd5aa2e807_tiny","dataType":"pic","page_url":"http://mt.sohu.com/20160110/n434043862.shtml","pic_url":"http://photocdn.sohu.com/20160110/mp53614587_1452403003652_3.jpeg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"337","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://photocdn.sohu.com/20160110/mp53614587_1452403003652_3.jpeg","https_convert":"0","imgkey1":"03a412090028a409","imgkey2":"b59da1e3f8e12165","imgcolor":"132","hittag":"0","thumb_width":"370","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"前不久,搜狗搜索也宣布独家接入知乎全量数据,一方面,搜索用户可以在搜索结果中即时获取知乎两千万专业问答知识.同时上线的搜狗知乎频道,垂直聚合了来自知乎的优质内容.对于亿万普通用户来说,搜索是他们获得精准内容的最佳途径,搜狗通过与知乎的连接,让平台沉淀下来的","summarypc":"0","mf_id":"c77940dd5aa2e807","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"搜狐公众平台","painter_year":"","docidx":"23","grpdocs":null,"grpdata":null,"simdata":[["50d2f8e19304f850-8bb9d7673476e422-f7a7c074e4fe7d93a05c87716a2b6ea0","500","388","1","https://i04piccdn.sogoucdn.com/1f04beab535fc986"],["b4f7182c5244a487-e6df3715707fd1f5-fcf64d56bae4b5df2d73ba75a366ef6c","2083","1250","49","https://i04piccdn.sogoucdn.com/29335f22669272df"],["e7d4cac126941b5a-d85d08272a80c21e-eb718b681023360845b17ebfcfa6051b","650","450","115","https://i01piccdn.sogoucdn.com/036c09e42e36a9e0"],["c15845dc66bb5366-4d75e09f38cb0a2a-628078e4a77709506e306ec7b1b78cf6","255","372","90","https://i01piccdn.sogoucdn.com/11c66fb9978aedcd"],["87498d72cc4156a1-5dfe41ca84a55235-9b65cac8f77dfe58f9bf74eac6344718","525","436","76","https://i01piccdn.sogoucdn.com/1252a0466a672fbc"],["31e992ba604be34c-3bab2b9f5234dfda-8ef5d4b18cc6d4b4ff361733effb62cc","270","480","6","https://i01piccdn.sogoucdn.com/d67f85b5d3a06302"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://photocdn.sohu.com/20160110/mp53614587_1452403003652_3.jpeg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜索争夺原创内容 搜狗接入知乎两千万专业问答知识","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1515831053","uri":""},{"type":-1,"cacheIndex":24,"title":"微信上线 看一看 搜一搜 功能,内容推荐可精准到地域 微果酱","markedTitle":"微信上线 看一看 搜一搜 功能,内容推荐可精准到地域 微果酱","url":null,"summary":null,"markedSummary":null,"size":"84834","date":null,"encoding":null,"time":0,"docid":"5d5f988751d51201-42fbd43f9fbc9f30-5961535c6180709db1914e46bc1a371f","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/a99b53968a76ed07","smallThumbUrl":"https://i02piccdn.sogoucdn.com/a99b53968a76ed07_tiny","dataType":"pic","page_url":"http://wpweixin.com/post/20872/","pic_url":"http://7u2jgb.com1.z0.glb.clouddn.com/wp-content/uploads/2017/05/6.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"720","height":"1280","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://7u2jgb.com1.z0.glb.clouddn.com/wp-content/uploads/2017/05/6.jpg","https_convert":"0","imgkey1":"067807ff07ffffff","imgkey2":"d58c687e85b4cbee","imgcolor":"231","hittag":"0","thumb_width":"249","thumb_height":"446","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"a99b53968a76ed07","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"","painter_year":"","docidx":"24","grpdocs":null,"grpdata":null,"simdata":[["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7bdd091e78adcdfc5566e1914ab7219b","1082","1561","32","https://i01piccdn.sogoucdn.com/40562c4b81bac5e6"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-30dee288838c5a1918038101616fca13","1414","766","50","https://i02piccdn.sogoucdn.com/f927bd183b05e5f5"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-ea0b630106dd17e596aa81c9ee2b53f0","500","889","69","https://i02piccdn.sogoucdn.com/45596ef5aacb1ccd"],["0e0d55ef93578e28-c56a20db2f0912f6-62dd738e6a3e2fa4206b7d8598c1dd06","1200","1064","109","https://i01piccdn.sogoucdn.com/45aecbc861c77a92"],["95c435a20586d145-208298664a9952f8-d6dde712e8c180886d6fb7a7cb46adec","2280","1950","42","https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://7u2jgb.com1.z0.glb.clouddn.com/wp-content/uploads/2017/05/6.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"微信上线 看一看 搜一搜 功能,内容推荐可精准到地域 微果酱","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1544845601","uri":""},{"type":-1,"cacheIndex":25,"title":"搜一搜 搜索 搜索指定内容 朋友圈 文章 公众号 小说 音乐 表情","markedTitle":"搜一搜 搜索 搜索指定内容 朋友圈 文章 公众号 小说 音乐 表情","url":null,"summary":null,"markedSummary":null,"size":"189165","date":null,"encoding":null,"time":0,"docid":"d7036c9a17f5fda2-d3197ab23d597bf0-4577cdc0ac5e09f6601469c7140ca11d","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/56403d1f0f0484bd","smallThumbUrl":"https://i03piccdn.sogoucdn.com/56403d1f0f0484bd_tiny","dataType":"pic","page_url":"https://t.cj.sina.com.cn/articles/view/5918992542/160cca89e019001nde","pic_url":"https://n.sinaimg.cn/translate/20170715/1Gly-fyiavtv7604677.gif","similarUrlFirst":null,"similarUrlSecond":null,"width":"1801","height":"3106","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"https://n.sinaimg.cn/translate/20170715/1Gly-fyiavtv7604677.gif","https_convert":"0","imgkey1":"07d801ff07ffffff","imgkey2":"e280001c00a0800a","imgcolor":"234","hittag":"0","thumb_width":"499","thumb_height":"862","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"56403d1f0f0484bd","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":1,"gifpic":1,"ch_site_name":"财经头条","painter_year":"","docidx":"25","grpdocs":null,"grpdata":null,"simdata":[["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7bdd091e78adcdfc5566e1914ab7219b","1082","1561","32","https://i01piccdn.sogoucdn.com/40562c4b81bac5e6"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-30dee288838c5a1918038101616fca13","1414","766","50","https://i02piccdn.sogoucdn.com/f927bd183b05e5f5"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-ea0b630106dd17e596aa81c9ee2b53f0","500","889","69","https://i02piccdn.sogoucdn.com/45596ef5aacb1ccd"],["0e0d55ef93578e28-c56a20db2f0912f6-62dd738e6a3e2fa4206b7d8598c1dd06","1200","1064","109","https://i01piccdn.sogoucdn.com/45aecbc861c77a92"],["95c435a20586d145-208298664a9952f8-d6dde712e8c180886d6fb7a7cb46adec","2280","1950","42","https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://n.sinaimg.cn/translate/20170715/1Gly-fyiavtv7604677.gif","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜一搜 搜索 搜索指定内容 朋友圈 文章 公众号 小说 音乐 表情","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1565262302","uri":""},{"type":-1,"cacheIndex":26,"title":"检索那些事儿","markedTitle":"检索那些事儿","url":null,"summary":null,"markedSummary":null,"size":"212106","date":null,"encoding":null,"time":0,"docid":"9fc097932c179cba-33a593c239cbcf30-1cebc5dcb386fac20ef86131e056b007","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/6a7343530ee7705e","smallThumbUrl":"https://i03piccdn.sogoucdn.com/6a7343530ee7705e_tiny","dataType":"pic","page_url":"https://blog.csdn.net/qq_41337581/article/details/104992369","pic_url":"https://img-blog.csdnimg.cn/20200320171655847.png?x-oss-processimage/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMzM3NTgx,size_16,color_FFFFFF,t_70","similarUrlFirst":null,"similarUrlSecond":null,"width":"1920","height":"1042","speedrank":null,"summarytype":"InstantSummary","ori_pic_url":"https://img-blog.csdnimg.cn/20200320171655847.png?x-oss-processimage/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMzM3NTgx,size_16,color_FFFFFF,t_70","https_convert":"0","imgkey1":"06dc09ff07ffffff","imgkey2":"6573e7ce1e20a792","imgcolor":"231","hittag":"0","thumb_width":"500","thumb_height":"271","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"3、举一反三,搜索\"码之泪殇\",不含csdn,则:码之泪殇 -csdn: 4、指定网站搜索:关键字 site:网址 5、intitle,搜索出标题包含这个内容的内容. 1、首先来个常规搜索:在百度搜索\"码之泪殇\": 这样百度会例举出所有的与","summarypc":"0","mf_id":"6a7343530ee7705e","sohu_image":"","lastmodified":"6天前","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"CSDN博客","painter_year":"","docidx":"26","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-5b8f19cfa3b905c0349235a05c81b945","703","503","85","https://i01piccdn.sogoucdn.com/8fa0fcb7d2db916d"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://img-blog.csdnimg.cn/20200320171655847.png?x-oss-processimage/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMzM3NTgx,size_16,color_FFFFFF,t_70","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"检索那些事儿","showSnapShot":false,"normalSummary":false,"fastSummary":false,"allSummary":false,"ldata":"1601751262","uri":""},{"type":-1,"cacheIndex":27,"title":"win7 搜索文件内容的软件","markedTitle":"win7 搜索文件内容的软件","url":null,"summary":null,"markedSummary":null,"size":"99957","date":null,"encoding":null,"time":0,"docid":"60d2f4fe0275d790-60de8deab87e73ea-5863c4d5aa925ac5b4131bac4dc79892","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/ac6e12e9954ef59e","smallThumbUrl":"https://i02piccdn.sogoucdn.com/ac6e12e9954ef59e_tiny","dataType":"pic","page_url":"https://zhidao.baidu.com/question/241130329","pic_url":"http://redirect.sogou.com/proxy?url=aHR0cHM6Ly9nc3MwLmJhaWR1LmNvbS8tZm8zZFNhZ194STRraEdrbzlXVEFuRjZoaHkvemhpZGFvL3doJTNENjAwJTJDODAwL3NpZ249MWQwZGViZDI4YTU0OTRlZTg3NzcwNzFmMWRjNWNjYzYvNjE1OTI1MmRkNDJhMjgzNGRhNDg1YzY2NWRiNWM5ZWExNGNlYmZmNS5qcGc=&md5=df3290dc144d015fb08922ecc7ccf880","similarUrlFirst":null,"similarUrlSecond":null,"width":"387","height":"441","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://redirect.sogou.com/proxy?url=aHR0cHM6Ly9nc3MwLmJhaWR1LmNvbS8tZm8zZFNhZ194STRraEdrbzlXVEFuRjZoaHkvemhpZGFvL3doJTNENjAwJTJDODAwL3NpZ249MWQwZGViZDI4YTU0OTRlZTg3NzcwNzFmMWRjNWNjYzYvNjE1OTI1MmRkNDJhMjgzNGRhNDg1YzY2NWRiNWM5ZWExNGNlYmZmNS5qcGc=&md5=df3290dc144d015fb08922ecc7ccf880","https_convert":"0","imgkey1":"05880bff07ff6dff","imgkey2":"725ec60d4422a09a","imgcolor":"231","hittag":"0","thumb_width":"250","thumb_height":"285","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"开始搜索,观察结果.如图所示: 观看原始文件,一会搜索的内容为 123 ,等待最后观察结果. 修改【常规】-【导航窗格】, 如图所示:","summarypc":"0","mf_id":"ac6e12e9954ef59e","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"百度知道","painter_year":"","docidx":"27","grpdocs":null,"grpdata":null,"simdata":[["60d2f4fe0275d790-60de8deab87e73ea-8d2435905ae51addd627db715d73cf4a","299","349","87","https://i02piccdn.sogoucdn.com/51570b348c82aa07"],["52bd25aae5328259-39f44a6edd2677ed-37c077cd49d3e57e5150ff7e718508b4","500","375","10","https://i03piccdn.sogoucdn.com/e1a9e5021d328ac8"],["5b5d1540fcc0037a-5d4937b85c3d68d5-896351d1da1f28284e572128f99e6540","494","444","110","https://i01piccdn.sogoucdn.com/181d2827b017dab0"],["60d2f4fe0275d790-60de8deab87e73ea-cbb45889c8e08fef2ed8e3fb05750ee5","500","375","66","https://i04piccdn.sogoucdn.com/48336d5f9cf8b9b2"],["179aa7c39428dfb8-d4c53e2b069317b8-690c87a453146990592dd346afc654ce","500","360","105","https://i01piccdn.sogoucdn.com/76c78658df801cff"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7d7d7c7edb115aafb552911f6f9fa8f8","554","452","78","https://i04piccdn.sogoucdn.com/8f0489d29f2a58be"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://gss0.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/zhidao/wh%3D600%2C800/sign=1d0debd28a5494ee8777071f1dc5ccc6/6159252dd42a2834da485c665db5c9ea14cebff5.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"win7 搜索文件内容的软件","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1527144508","uri":""},{"type":-1,"cacheIndex":28,"title":"第五:点击查找按钮以后查找到的内容会被选中,然后选中查找和替换窗口左下角的列出结果","markedTitle":"第五:点击查找按钮以后查找到的内容会被选中,然后选中查找和替换窗口左下角的列出结果","url":null,"summary":null,"markedSummary":null,"size":"66429","date":null,"encoding":null,"time":0,"docid":"befd9d63b8424b78-237383593fab7226-e7bf6db4e5d62dc281a4c820095fd96a","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/346ab7a2b8f8e218","smallThumbUrl":"https://i03piccdn.sogoucdn.com/346ab7a2b8f8e218_tiny","dataType":"pic","page_url":"http://www.zs-edu.com/news_Show.asp?id=1598&nclass=15","pic_url":"http://www.zs-edu.com/uploadfile/20120906144631600.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"502","height":"425","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://www.zs-edu.com/uploadfile/20120906144631600.jpg","https_convert":"0","imgkey1":"01c4185b05d6ebb5","imgkey2":"ab88334c39d4cf77","imgcolor":"134","hittag":"0","thumb_width":"338","thumb_height":"286","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"第六:选中列出结果以后再列出结果下拉栏里面就会看到选中的结果,如果查找的内容还有很多个就可以点击窗口下面的查找下一个按钮 第三:鼠标点击编辑按钮以后会出现编辑下拉菜单,移动鼠标在下拉菜单上面找到查找,并鼠标点击查找 第四:点击查找以后会出现查找和替","summarypc":"0","mf_id":"346ab7a2b8f8e218","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"","painter_year":"","docidx":"28","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-5b8f19cfa3b905c0349235a05c81b945","703","503","85","https://i01piccdn.sogoucdn.com/8fa0fcb7d2db916d"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://www.zs-edu.com/uploadfile/20120906144631600.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"第五:点击查找按钮以后查找到的内容会被选中,然后选中查找和替换窗口左下角的列出结果","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1547874078","uri":""},{"type":-1,"cacheIndex":29,"title":"搜索的内容求更新","markedTitle":"搜索的内容求更新","url":null,"summary":null,"markedSummary":null,"size":"40877","date":null,"encoding":null,"time":0,"docid":"e5ef5b60d960823f-3dc8e6473e318bc8-91cd33db3bdb05bf15b445f1f6ef187a","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/8a2e7a72a43f6a36","smallThumbUrl":"https://i04piccdn.sogoucdn.com/8a2e7a72a43f6a36_tiny","dataType":"pic","page_url":"http://bbs.360.cn/thread-14853101-1-1.html","pic_url":"http://p0.qhmsg.com/t01dda90c71011da28b.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"761","height":"390","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p0.qhmsg.com/t01dda90c71011da28b.jpg","https_convert":"0","imgkey1":"04e40fff07ffffff","imgkey2":"d5e37b4087f65bd7","imgcolor":"231","hittag":"0","thumb_width":"487","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"8a2e7a72a43f6a36","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"360安全社区","painter_year":"","docidx":"29","grpdocs":null,"grpdata":null,"simdata":[["179aa7c39428dfb8-d4c53e2b069317b8-690c87a453146990592dd346afc654ce","500","360","105","https://i01piccdn.sogoucdn.com/76c78658df801cff"],["9c055dc8861f32c2-e99b83b14f5785be-25a8591171910d68664e4eb48f13f17b","1080","1920","39","https://i01piccdn.sogoucdn.com/6aab4191bb3c13fb"],["e5ef5b60d960823f-3dc8e6473e318bc8-cab6af6a34fa0d76db1976d942873457","967","437","11","https://i03piccdn.sogoucdn.com/bdff1e430a9ae1a9"],["60d2f4fe0275d790-60de8deab87e73ea-0505cceaa60ec3f018eb9bd16c6e1abd","600","419","62","https://i01piccdn.sogoucdn.com/64bf8c211c841b38"],["cb0914269919bdc6-db2d8f437aa50a85-7d2008c1006fe8135e9bdcd3a800506f","532","476","101","https://i04piccdn.sogoucdn.com/9a73e82a442f4ff2"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-8a125d9f7c540e30747abc7158876027","500","333","116","https://i01piccdn.sogoucdn.com/42e4c8a4ad0fefee"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p0.qhmsg.com/t01dda90c71011da28b.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"搜索的内容求更新","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1569541981","uri":""},{"type":-1,"cacheIndex":30,"title":"首先打开一个word,将姓名身份证信息复制到其中(上图为了保护隐私,涂抹了部分身份证号码),然后按下ctrl+h弹出\"查找和替换\"对话框,\"查找内容\"处输入[0-9x]{1,},\"替换为\"处输入^t^&^p,点击\"更多\"并勾选\"使用通配符\",最后点击\"全?","markedTitle":"首先打开一个word,将姓名身份证信息复制到其中(上图为了保护隐私,涂抹了部分身份证号码),然后按下ctrl+h弹出\"查找和替换\"对话框,\"查找内容\"处输入[0-9x]{1,},\"替换为\"处输入^t^&^p,点击\"更多\"并勾选\"使用通配符\",最后点击\"全?","url":null,"summary":null,"markedSummary":null,"size":"27387","date":null,"encoding":null,"time":0,"docid":"52bd25aae5328259-39f44a6edd2677ed-c6b38bbde60e7ea1b9c4bff6a39bc8e1","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/d30438a18255926d","smallThumbUrl":"https://i02piccdn.sogoucdn.com/d30438a18255926d_tiny","dataType":"pic","page_url":"http://www.7edown.com/ceping/117538_1.html","pic_url":"http://img.7edown.com/upload/2017/1/18/201711819595932723.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"486","height":"534","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://img.7edown.com/upload/2017/1/18/201711819595932723.jpg","https_convert":"0","imgkey1":"05e005ff07ffffff","imgkey2":"8a2be9c4ff40cff4","imgcolor":"231","hittag":"0","thumb_width":"250","thumb_height":"274","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"安卓版下载: Office for Android(金山WPS手机版) 安卓版","summarypc":"0","mf_id":"d30438a18255926d","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"创e下载园","painter_year":"","docidx":"30","grpdocs":null,"grpdata":null,"simdata":[["52bd25aae5328259-39f44a6edd2677ed-37c077cd49d3e57e5150ff7e718508b4","500","375","10","https://i03piccdn.sogoucdn.com/e1a9e5021d328ac8"],["60d2f4fe0275d790-60de8deab87e73ea-addf51f11ddcdab0b909f330d1a9c616","491","404","68","https://i01piccdn.sogoucdn.com/1664b7e3c32a1182"],["60d2f4fe0275d790-60de8deab87e73ea-e17add337725d2a3a2610ad20648235d","496","402","86","https://i04piccdn.sogoucdn.com/823a20002ea19ed7"],["179aa7c39428dfb8-d4c53e2b069317b8-d887667b6a3105738d7c19d5dabb8c0d","396","463","77","https://i04piccdn.sogoucdn.com/fdf64e2c13b69f6c"],["dc2b08b5a1471896-b323379cd0653b16-af3f70cb3abd54816b989e01ab0b7c3e","500","338","112","https://i02piccdn.sogoucdn.com/2cc36cb2e7e4c266"],["5b5d1540fcc0037a-5d4937b85c3d68d5-896351d1da1f28284e572128f99e6540","494","444","110","https://i01piccdn.sogoucdn.com/181d2827b017dab0"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://img.7edown.com/upload/2017/1/18/201711819595932723.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"首先打开一个word,将姓名身份证信息复制到其中(上图为了保护隐私,涂抹了部分身份证号码),然后按下ctrl+h弹出\"查找和替换\"对话框,\"查找内容\"处输入[0-9x]{1,},\"替换为\"处输入^t^&^p,点击\"更多\"并勾选\"使用通配符\",最后点击\"全?","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1584048033","uri":""},{"type":-1,"cacheIndex":31,"title":"同样的搜索内容,在谷歌地图里的结果是这样的:","markedTitle":"同样的搜索内容,在谷歌地图里的结果是这样的:","url":null,"summary":null,"markedSummary":null,"size":"39395","date":null,"encoding":null,"time":0,"docid":"c286ca7ecc6f7a79-fd6afc44e6e3634f-7e45363e401f7f9a97063714694acd61","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/68ffa49e9e94116b","smallThumbUrl":"https://i03piccdn.sogoucdn.com/68ffa49e9e94116b_tiny","dataType":"pic","page_url":"http://toutiao.com/item/6229228532447314433/","pic_url":"http://p2.pstatp.com/large/10667/8559731449","similarUrlFirst":null,"similarUrlSecond":null,"width":"554","height":"402","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p2.pstatp.com/large/10667/8559731449","https_convert":"0","imgkey1":"049c1bff07fbfd6d","imgkey2":"cad00833e4011c5a","imgcolor":"231","hittag":"0","thumb_width":"344","thumb_height":"249","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"说到这里,似乎这篇文章变成了黑百度,初心并不是这样的.可是在看网友的反应时,几乎所有的网友观点都是一边倒,让我不得不感叹,百度你这是伤了多少人的心. 在12月16日的世界互联网大会上,有记者问到李彦宏是如何看待谷歌将要重返中国的,百度的回应只有四个字:","summarypc":"0","mf_id":"68ffa49e9e94116b","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"今日头条","painter_year":"","docidx":"31","grpdocs":null,"grpdata":null,"simdata":[["179aa7c39428dfb8-d4c53e2b069317b8-c9b08ecdb345d46f7c7ea78572384cc0","555","550","3","https://i04piccdn.sogoucdn.com/03e800c0d94b36e7"],["699bf7cc633628ff-ca2c404122fa1c0d-a2065a4753c2e762e34d42f7d4e67e9c","500","397","18","https://i03piccdn.sogoucdn.com/64fd0de292f8fefd"],["cb0914269919bdc6-db2d8f437aa50a85-7d2008c1006fe8135e9bdcd3a800506f","532","476","101","https://i04piccdn.sogoucdn.com/9a73e82a442f4ff2"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-8a125d9f7c540e30747abc7158876027","500","333","116","https://i01piccdn.sogoucdn.com/42e4c8a4ad0fefee"],["e154002750821088-20370af6263487c0-d300e917a61071a5feb760681fb94b83","1280","800","47","https://i02piccdn.sogoucdn.com/db76a1243d97e233"],["60d2f4fe0275d790-60de8deab87e73ea-823002633234b42bc2ce5d9d7b97ca19","488","399","79","https://i04piccdn.sogoucdn.com/610efdfbf9e08c3e"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p2.pstatp.com/large/10667/8559731449","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"同样的搜索内容,在谷歌地图里的结果是这样的:","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1450356028","uri":""},{"type":-1,"cacheIndex":32,"title":"q 搜索 取消 搜索指定内容 朋友圈 文章 公众号 小程序 音乐 表情 按住说话 123 abc def 第报","markedTitle":"q 搜索 取消 搜索指定内容 朋友圈 文章 公众号 小程序 音乐 表情 按住说话 123 abc def 第报","url":null,"summary":null,"markedSummary":null,"size":"44231","date":null,"encoding":null,"time":0,"docid":"abe1eea3ca79fc28-c577ebdcb0f3dbcc-7bdd091e78adcdfc5566e1914ab7219b","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/40562c4b81bac5e6","smallThumbUrl":"https://i01piccdn.sogoucdn.com/40562c4b81bac5e6_tiny","dataType":"pic","page_url":"http://www.sohu.com/na/330567560_115479?scm=1002.45005a.15d015e0164.PC_NEW_ARTICLE_REC&spm=smpc.content%2Fnew.fd-d.5.1564963200026oXoZw5N","pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20190731/3408ab353dfb44f1b5b5fc4cb5a11731.jpeg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1082","height":"1561","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20190731/3408ab353dfb44f1b5b5fc4cb5a11731.jpeg","https_convert":"0","imgkey1":"063803ff07ffffff","imgkey2":"cdcc3a5e8bf4cb47","imgcolor":"231","hittag":"0","thumb_width":"500","thumb_height":"721","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"40562c4b81bac5e6","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"搜狐网","painter_year":"","docidx":"32","grpdocs":null,"grpdata":null,"simdata":[["5d5f988751d51201-42fbd43f9fbc9f30-5961535c6180709db1914e46bc1a371f","720","1280","24","https://i02piccdn.sogoucdn.com/a99b53968a76ed07"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-5430dfa85b163df678863d3f0b4ccb20","600","464","60","https://i03piccdn.sogoucdn.com/3254d571e1625301"],["0e0d55ef93578e28-c56a20db2f0912f6-62dd738e6a3e2fa4206b7d8598c1dd06","1200","1064","109","https://i01piccdn.sogoucdn.com/45aecbc861c77a92"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-ea0b630106dd17e596aa81c9ee2b53f0","500","889","69","https://i02piccdn.sogoucdn.com/45596ef5aacb1ccd"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-30dee288838c5a1918038101616fca13","1414","766","50","https://i02piccdn.sogoucdn.com/f927bd183b05e5f5"],["699bf7cc633628ff-7652b36ba6945424-2ea3018d7816de99613ef3bb53762d59","500","404","20","https://i02piccdn.sogoucdn.com/d7c81b36f95ac85a"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://5b0988e595225.cdn.sohucs.com/images/20190731/3408ab353dfb44f1b5b5fc4cb5a11731.jpeg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"q 搜索 取消 搜索指定内容 朋友圈 文章 公众号 小程序 音乐 表情 按住说话 123 abc def 第报","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1567167723","uri":""},{"type":-1,"cacheIndex":33,"title":"图3根据需要,用户可随意调用谷歌、百度、搜狗引擎搜索同一组关键词内容","markedTitle":"图3根据需要,用户可随意调用谷歌、百度、搜狗引擎搜索同一组关键词内容","url":null,"summary":null,"markedSummary":null,"size":"63986","date":null,"encoding":null,"time":0,"docid":"a29cab63ccf7a15e-ce5ae5bf0cb7826c-0534ae96cac6835d9056dcd3ff50ab15","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/dd50078c7c8bfefc","smallThumbUrl":"https://i02piccdn.sogoucdn.com/dd50078c7c8bfefc_tiny","dataType":"pic","page_url":"http://soft.zol.com.cn/129/1295797.html","pic_url":"https://img2.zol.com.cn/product/29_450x337/134/cegUoMzaEGqMQ.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"316","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://img2.zol.com.cn/product/29_450x337/134/cegUoMzaEGqMQ.jpg","https_convert":"1","imgkey1":"05ec0dff07fffffe","imgkey2":"354f3642c0fc8568","imgcolor":"7","hittag":"0","thumb_width":"396","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"远不用思考谁家更强,因为,傲游浏览器强大的\"多重搜索\"可以同时启用多个搜索引擎共同搜索同一组关键词.根据需要,你既可以浏览到百度的搜索结果,也能查看到谷歌的搜索内容,还能轻松调用搜狗、有道的搜索引擎,哪个符合需要就用哪个,不用反复搜索,只需点击一次就能对比","summarypc":"0","mf_id":"dd50078c7c8bfefc","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"中关村在线","painter_year":"","docidx":"33","grpdocs":null,"grpdata":null,"simdata":[["60d2f4fe0275d790-60de8deab87e73ea-addf51f11ddcdab0b909f330d1a9c616","491","404","68","https://i01piccdn.sogoucdn.com/1664b7e3c32a1182"],["60d2f4fe0275d790-60de8deab87e73ea-e17add337725d2a3a2610ad20648235d","496","402","86","https://i04piccdn.sogoucdn.com/823a20002ea19ed7"],["8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","1266","1069","21","https://i02piccdn.sogoucdn.com/45cd399284b661b6"],["60d2f4fe0275d790-60de8deab87e73ea-d2acc14192d8ecce0cc5646300244136","600","289","72","https://i03piccdn.sogoucdn.com/ec73176953962465"],["dc2b08b5a1471896-b323379cd0653b16-af3f70cb3abd54816b989e01ab0b7c3e","500","338","112","https://i02piccdn.sogoucdn.com/2cc36cb2e7e4c266"],["52bd25aae5328259-39f44a6edd2677ed-c6b38bbde60e7ea1b9c4bff6a39bc8e1","486","534","30","https://i02piccdn.sogoucdn.com/d30438a18255926d"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://img2.zol.com.cn/product/29_450x337/134/cegUoMzaEGqMQ.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"图3根据需要,用户可随意调用谷歌、百度、搜狗引擎搜索同一组关键词内容","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1569354274","uri":""},{"type":-1,"cacheIndex":34,"title":"百度搜索的时候,输入内容后,在搜索框下方会出现相关搜索内容,这样内容怎样添加的","markedTitle":"百度搜索的时候,输入内容后,在搜索框下方会出现相关搜索内容,这样内容怎样添加的","url":null,"summary":null,"markedSummary":null,"size":"10244","date":null,"encoding":null,"time":0,"docid":"60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/0a33b821da2f188f","smallThumbUrl":"https://i02piccdn.sogoucdn.com/0a33b821da2f188f_tiny","dataType":"pic","page_url":"https://zhidao.baidu.com/question/349704786","pic_url":"http://redirect.sogou.com/proxy?url=aHR0cHM6Ly9nc3MwLmJhaWR1LmNvbS8tZm8zZFNhZ194STRraEdrbzlXVEFuRjZoaHkvemhpZGFvL3BpYy9pdGVtLzk4MjViYzMxNWM2MDM0YTgzOGQzYmJjOGNiMTM0OTU0MDkyMzc2NDEuanBn&md5=12f3f30ce6270f67ce7237a775de81e7","similarUrlFirst":null,"similarUrlSecond":null,"width":"499","height":"393","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://redirect.sogou.com/proxy?url=aHR0cHM6Ly9nc3MwLmJhaWR1LmNvbS8tZm8zZFNhZ194STRraEdrbzlXVEFuRjZoaHkvemhpZGFvL3BpYy9pdGVtLzk4MjViYzMxNWM2MDM0YTgzOGQzYmJjOGNiMTM0OTU0MDkyMzc2NDEuanBn&md5=12f3f30ce6270f67ce7237a775de81e7","https_convert":"0","imgkey1":"06e007ff07ffffff","imgkey2":"a70e86a90ab0a421","imgcolor":"231","hittag":"0","thumb_width":"317","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"","summarypc":"0","mf_id":"0a33b821da2f188f","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"百度知道","painter_year":"","docidx":"34","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"],["699bf7cc633628ff-4e8c09e6bbe46596-33cda9927d7cfc5a0028f3071cb884b1","245","368","114","https://i03piccdn.sogoucdn.com/2712096f7775e1fa"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"],["95c435a20586d145-208298664a9952f8-d6dde712e8c180886d6fb7a7cb46adec","2280","1950","42","https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-5b8f19cfa3b905c0349235a05c81b945","703","503","85","https://i01piccdn.sogoucdn.com/8fa0fcb7d2db916d"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://gss0.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/zhidao/pic/item/9825bc315c6034a838d3bbc8cb13495409237641.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"百度搜索的时候,输入内容后,在搜索框下方会出现相关搜索内容,这样内容怎样添加的","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1510168699","uri":""},{"type":-1,"cacheIndex":35,"title":"2- 在搜索框搜索内容,填入\"<script>alert('xss')<\/script>\", 点击搜索.","markedTitle":"2- 在搜索框搜索内容,填入\"<script>alert('xss')<\/script>\", 点击搜索.","url":null,"summary":null,"markedSummary":null,"size":"33837","date":null,"encoding":null,"time":0,"docid":"abe1eea3ca79fc28-c577ebdcb0f3dbcc-151a60e5be1ce6f86e8512ecb9891ded","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/09856afe6f2b67ab","smallThumbUrl":"https://i01piccdn.sogoucdn.com/09856afe6f2b67ab_tiny","dataType":"pic","page_url":"http://www.sohu.com/a/199451301_505818","pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20171022/d089dac7650d441f9314ca5ced7d0746.jpeg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1240","height":"583","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20171022/d089dac7650d441f9314ca5ced7d0746.jpeg","https_convert":"0","imgkey1":"06e001ff07ffffff","imgkey2":"0a3b8dcfde4bb6a0","imgcolor":"231","hittag":"0","thumb_width":"532","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"在搜索框搜索内容,填入\"\", 点击搜索. 当前端页面没有对填入的数据进行过滤,直接显示在页面上, 这时就会alert那个字符串出来. (当然上图是模拟的) 主要通过利用系统反馈行为漏洞,并欺骗用户主动触发,从而发起Web攻击.举个栗子: 假","summarypc":"0","mf_id":"09856afe6f2b67ab","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"搜狐网","painter_year":"","docidx":"35","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["9fc097932c179cba-33a593c239cbcf30-1cebc5dcb386fac20ef86131e056b007","1920","1042","26","https://i03piccdn.sogoucdn.com/6a7343530ee7705e"],["699bf7cc633628ff-4e8c09e6bbe46596-33cda9927d7cfc5a0028f3071cb884b1","245","368","114","https://i03piccdn.sogoucdn.com/2712096f7775e1fa"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://5b0988e595225.cdn.sohucs.com/images/20171022/d089dac7650d441f9314ca5ced7d0746.jpeg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"2- 在搜索框搜索内容,填入\"<script>alert('xss')<\/script>\", 点击搜索.","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1521182417","uri":""},{"type":-1,"cacheIndex":36,"title":"新增「内容搜索」:帮助搜索高质量答主,相关咨询内容和旁听问答.","markedTitle":"新增「内容搜索」:帮助搜索高质量答主,相关咨询内容和旁听问答.","url":null,"summary":null,"markedSummary":null,"size":"117018","date":null,"encoding":null,"time":0,"docid":"abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50","smallThumbUrl":"https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50_tiny","dataType":"pic","page_url":"https://www.sohu.com/a/392063964_114819","pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20200429/f331e5226c5e4e68a35e761d354dd1ac.jpeg","similarUrlFirst":null,"similarUrlSecond":null,"width":"985","height":"1386","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20200429/f331e5226c5e4e68a35e761d354dd1ac.jpeg","https_convert":"0","imgkey1":"06cc03ff07ffffff","imgkey2":"252687ef5e43a633","imgcolor":"231","hittag":"0","thumb_width":"499","thumb_height":"703","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"新增「内容搜索」:帮助搜索高质量答主,相关咨询内容和旁听问答. 新增「为你推荐」:通过问答社区、学习课程等动态,推荐用户可能需要提问的答主. 增多「问答社区」入口:虽然目前问答社区少数情况会展示旁听的「付费咨询」,但是入口仍旧不足,可在相关问题下,","summarypc":"0","mf_id":"3f8fdafe7dc42f50","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"搜狐网","painter_year":"","docidx":"36","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"],["9fc097932c179cba-33a593c239cbcf30-1cebc5dcb386fac20ef86131e056b007","1920","1042","26","https://i03piccdn.sogoucdn.com/6a7343530ee7705e"],["95c435a20586d145-208298664a9952f8-d6dde712e8c180886d6fb7a7cb46adec","2280","1950","42","https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9"],["699bf7cc633628ff-4e8c09e6bbe46596-33cda9927d7cfc5a0028f3071cb884b1","245","368","114","https://i03piccdn.sogoucdn.com/2712096f7775e1fa"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://5b0988e595225.cdn.sohucs.com/images/20200429/f331e5226c5e4e68a35e761d354dd1ac.jpeg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"新增「内容搜索」:帮助搜索高质量答主,相关咨询内容和旁听问答.","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1590975181","uri":""},{"type":-1,"cacheIndex":37,"title":"曾经的浏览器或许只能用来浏览文字图片,但随着一步步进化,它已经能实现越来越多的功能,比如说你在google搜索thanos(灭霸),点击右侧的\"无限手套\",打个响指,搜索到的一半内容都会渐渐消失:","markedTitle":"曾经的浏览器或许只能用来浏览文字图片,但随着一步步进化,它已经能实现越来越多的功能,比如说你在google搜索thanos(灭霸),点击右侧的\"无限手套\",打个响指,搜索到的一半内容都会渐渐消失:","url":null,"summary":null,"markedSummary":null,"size":"46642","date":null,"encoding":null,"time":0,"docid":"b2e12f49fbf34498-f82f64813d2835fb-f397cb6ff43111e106460e2ef3cbbf88","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/75d5fb693b3cab68","smallThumbUrl":"https://i02piccdn.sogoucdn.com/75d5fb693b3cab68_tiny","dataType":"pic","page_url":"https://www.bilibili.com/read/cv3882806","pic_url":"http://i0.hdslb.com/bfs/article/8a24f957b83a890646911b749c473ab9b346b6f3.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"553","height":"334","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://i0.hdslb.com/bfs/article/8a24f957b83a890646911b749c473ab9b346b6f3.jpg","https_convert":"0","imgkey1":"060013ff06ffffbf","imgkey2":"85af28f2eab46b64","imgcolor":"231","hittag":"0","thumb_width":"500","thumb_height":"301","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"未来浏览器的发展显然不只是速度更快、兼容性更高,更多的是功能以及交互体验的强大;再或许是浏览器成为任何你想象中的样子.虽然那些在幕后默默贡献的开发者们可能没人再会想起,但他们的足迹将永远闪耀在历史长河里. 其他软件可能挺毒瘤的,不过对于浏览器来说并非如","summarypc":"0","mf_id":"75d5fb693b3cab68","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"哔哩哔哩","painter_year":"","docidx":"37","grpdocs":null,"grpdata":null,"simdata":[["52bd25aae5328259-39f44a6edd2677ed-c6b38bbde60e7ea1b9c4bff6a39bc8e1","486","534","30","https://i02piccdn.sogoucdn.com/d30438a18255926d"],["60d2f4fe0275d790-60de8deab87e73ea-addf51f11ddcdab0b909f330d1a9c616","491","404","68","https://i01piccdn.sogoucdn.com/1664b7e3c32a1182"],["e154002750821088-e38be3ca4675d66a-53d43d4df1c49302381f6008ce219611","1080","628","106","https://i03piccdn.sogoucdn.com/5c3f5bca9ee44e97"],["60d2f4fe0275d790-60de8deab87e73ea-e17add337725d2a3a2610ad20648235d","496","402","86","https://i04piccdn.sogoucdn.com/823a20002ea19ed7"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7bdd091e78adcdfc5566e1914ab7219b","1082","1561","32","https://i01piccdn.sogoucdn.com/40562c4b81bac5e6"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-03b6a44c3cc486189b022b9a659211b3","380","344","98","https://i01piccdn.sogoucdn.com/648de3b625cf3494"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://i0.hdslb.com/bfs/article/8a24f957b83a890646911b749c473ab9b346b6f3.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"曾经的浏览器或许只能用来浏览文字图片,但随着一步步进化,它已经能实现越来越多的功能,比如说你在google搜索thanos(灭霸),点击右侧的\"无限手套\",打个响指,搜索到的一半内容都会渐渐消失:","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1596049623","uri":""},{"type":-1,"cacheIndex":38,"title":"3】 内容搜索: 您可以直接在pp加速器主界面的搜索框中输入您想观看的视频内容信息,然后直接回车或者点击右侧的搜索按钮,即可跳转到pp.tv海量视频搜索引擎寻找您所感兴趣的相关视频内容.","markedTitle":"3】 内容搜索: 您可以直接在pp加速器主界面的搜索框中输入您想观看的视频内容信息,然后直接回车或者点击右侧的搜索按钮,即可跳转到pp.tv海量视频搜索引擎寻找您所感兴趣的相关视频内容.","url":null,"summary":null,"markedSummary":null,"size":"29162","date":null,"encoding":null,"time":0,"docid":"a07cb0f7f05a72ab-e5c412eeaf388d92-9ec62f33a5f4655adfb81bc64f51c61b","debugInfo":null,"thumbUrl":"https://i03piccdn.sogoucdn.com/000d42bd57cc6d7e","smallThumbUrl":"https://i03piccdn.sogoucdn.com/000d42bd57cc6d7e_tiny","dataType":"pic","page_url":"http://www.greenxf.com/soft/117011.html","pic_url":"http://www.greenxf.com/soft/UploadPic/Upload/2016921859386366.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"554","height":"283","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://www.greenxf.com/soft/UploadPic/Upload/2016921859386366.jpg","https_convert":"0","imgkey1":"03dc13ff07ffffff","imgkey2":"ab0e274c19d6c737","imgcolor":"231","hittag":"0","thumb_width":"491","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"3、内容搜索: 您可以直接在PP加速器主界面的搜索框中输入您想观看的视频内容信息,然后直接回车或者点击右侧的搜索按钮,即可跳转到PP.tv海量视频搜索引擎寻找您所感兴趣的相关视频内容. 4、意见反馈: 如果您对PP加速器有任何建议,可以直接反馈给我们.","summarypc":"0","mf_id":"000d42bd57cc6d7e","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"绿色先锋","painter_year":"","docidx":"38","grpdocs":null,"grpdata":null,"simdata":[["75f49979e1128e6b-828d319750a4bfc5-04c93318471ce6a6b8521943b56391ce","500","380","107","https://i03piccdn.sogoucdn.com/3be69ede114f49cb"],["e44e55aef23c3512-0e808e84cbe9041e-3f57ffb5329e813b8f09fbfd9f380b3d","735","539","73","https://i04piccdn.sogoucdn.com/34c3bb5b41905407"],["13b5d0f75b18a3b6-38a0a5966c48d3f1-c5c3058bba1116b633b5b58af22c6ba0","403","432","4","https://i03piccdn.sogoucdn.com/377442f31f6b53e5"],["b17c8f01e57d5969-d3492e1ab3bea685-8f80bc8c71a09e482d849a0ac000f0b8","240","427","75","https://i01piccdn.sogoucdn.com/01f6e0171b96647c"],["31e992ba604be34c-08fbb683bff01adf-4b230a224ccee97c33e06357951b9830","270","479","95","https://i01piccdn.sogoucdn.com/a416b382fecf4a4d"],["75f49979e1128e6b-828d319750a4bfc5-e1e2dcb3e499155821036358a3a5bc3e","480","235","93","https://i01piccdn.sogoucdn.com/25fa7b07db631140"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://www.greenxf.com/soft/UploadPic/Upload/2016921859386366.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"3】 内容搜索: 您可以直接在pp加速器主界面的搜索框中输入您想观看的视频内容信息,然后直接回车或者点击右侧的搜索按钮,即可跳转到pp.tv海量视频搜索引擎寻找您所感兴趣的相关视频内容.","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1519871268","uri":""},{"type":-1,"cacheIndex":39,"title":"具体查询内容如下:","markedTitle":"具体查询内容如下:","url":null,"summary":null,"markedSummary":null,"size":"258061","date":null,"encoding":null,"time":0,"docid":"9c055dc8861f32c2-e99b83b14f5785be-25a8591171910d68664e4eb48f13f17b","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/6aab4191bb3c13fb","smallThumbUrl":"https://i01piccdn.sogoucdn.com/6aab4191bb3c13fb_tiny","dataType":"pic","page_url":"http://nm.xxt.cn/showWebEduInfo.do?id=1902469","pic_url":"https://nmpic.xxt.cn/bk/201810/45971539932518354.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1080","height":"1920","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://nmpic.xxt.cn/bk/201810/45971539932518354.jpg","https_convert":"1","imgkey1":"052c0dff07ffffff","imgkey2":"05c76ae1eed77b65","imgcolor":"231","hittag":"0","thumb_width":"249","thumb_height":"446","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"内蒙古和校园APP教师版最新功能上线,由于很多教师对家长的登录情况和订购情况不是很了解,所以我们为了解决大家关于这方面查询需求,本次上线更新的新版APP添加了这些功能,现将具体使用方法介绍给大家. 操作步骤如下","summarypc":"0","mf_id":"6aab4191bb3c13fb","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"","painter_year":"","docidx":"39","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7d7d7c7edb115aafb552911f6f9fa8f8","554","452","78","https://i04piccdn.sogoucdn.com/8f0489d29f2a58be"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-03b6a44c3cc486189b022b9a659211b3","380","344","98","https://i01piccdn.sogoucdn.com/648de3b625cf3494"],["cb0914269919bdc6-db2d8f437aa50a85-7d2008c1006fe8135e9bdcd3a800506f","532","476","101","https://i04piccdn.sogoucdn.com/9a73e82a442f4ff2"],["f48a6595ae8ba055-5b6cdbd288ffb74e-d9c99a164f461803c148dcadc213dcf9","986","623","108","https://i04piccdn.sogoucdn.com/b858ea058287bb9d"],["60d2f4fe0275d790-60de8deab87e73ea-0505cceaa60ec3f018eb9bd16c6e1abd","600","419","62","https://i01piccdn.sogoucdn.com/64bf8c211c841b38"],["179aa7c39428dfb8-d4c53e2b069317b8-690c87a453146990592dd346afc654ce","500","360","105","https://i01piccdn.sogoucdn.com/76c78658df801cff"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://nmpic.xxt.cn/bk/201810/45971539932518354.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"具体查询内容如下:","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1558426652","uri":""},{"type":-1,"cacheIndex":40,"title":"具体查询内容如下:","markedTitle":"具体查询内容如下:","url":null,"summary":null,"markedSummary":null,"size":"168182","date":null,"encoding":null,"time":0,"docid":"9c055dc8861f32c2-e99b83b14f5785be-163b15ccd9e707b4fdc4f13256afd068","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/7ba698ab956c0512","smallThumbUrl":"https://i01piccdn.sogoucdn.com/7ba698ab956c0512_tiny","dataType":"pic","page_url":"http://nm.xxt.cn/showWebEduInfo.do?id=1902469","pic_url":"https://nmpic.xxt.cn/bk/201810/83741539932488730.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"1080","height":"1920","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://nmpic.xxt.cn/bk/201810/83741539932488730.jpg","https_convert":"1","imgkey1":"05240dff07ffffb6","imgkey2":"2a5c87ed1a62a633","imgcolor":"231","hittag":"0","thumb_width":"249","thumb_height":"446","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"内蒙古和校园APP教师版最新功能上线,由于很多教师对家长的登录情况和订购情况不是很了解,所以我们为了解决大家关于这方面查询需求,本次上线更新的新版APP添加了这些功能,现将具体使用方法介绍给大家. 操作步骤如下","summarypc":"0","mf_id":"7ba698ab956c0512","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"","painter_year":"","docidx":"40","grpdocs":null,"grpdata":null,"simdata":[["5b5d1540fcc0037a-5d4937b85c3d68d5-896351d1da1f28284e572128f99e6540","494","444","110","https://i01piccdn.sogoucdn.com/181d2827b017dab0"],["179aa7c39428dfb8-d4c53e2b069317b8-c9b08ecdb345d46f7c7ea78572384cc0","555","550","3","https://i04piccdn.sogoucdn.com/03e800c0d94b36e7"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-8a125d9f7c540e30747abc7158876027","500","333","116","https://i01piccdn.sogoucdn.com/42e4c8a4ad0fefee"],["cb0914269919bdc6-db2d8f437aa50a85-7d2008c1006fe8135e9bdcd3a800506f","532","476","101","https://i04piccdn.sogoucdn.com/9a73e82a442f4ff2"],["179aa7c39428dfb8-d4c53e2b069317b8-690c87a453146990592dd346afc654ce","500","360","105","https://i01piccdn.sogoucdn.com/76c78658df801cff"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7d7d7c7edb115aafb552911f6f9fa8f8","554","452","78","https://i04piccdn.sogoucdn.com/8f0489d29f2a58be"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://nmpic.xxt.cn/bk/201810/83741539932488730.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"具体查询内容如下:","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1558426652","uri":""},{"type":-1,"cacheIndex":41,"title":"创作者在自身发展的过程中要不断探索内容付费、内容电商、广告合作等多种变","markedTitle":"创作者在自身发展的过程中要不断探索内容付费、内容电商、广告合作等多种变","url":null,"summary":null,"markedSummary":null,"size":"584378","date":null,"encoding":null,"time":0,"docid":"abe1eea3ca79fc28-c577ebdcb0f3dbcc-7672f003482d148c5bef4a6cc0b9ef9d","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/8286f4fe1c827903","smallThumbUrl":"https://i01piccdn.sogoucdn.com/8286f4fe1c827903_tiny","dataType":"pic","page_url":"http://www.sohu.com/a/380123054_100809","pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20200315/5058e589795c42e0b0e088681f26f893.jpeg","similarUrlFirst":null,"similarUrlSecond":null,"width":"4444","height":"2500","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://5b0988e595225.cdn.sohucs.com/images/20200315/5058e589795c42e0b0e088681f26f893.jpeg","https_convert":"0","imgkey1":"06a817ff07ffffbf","imgkey2":"a32e05057c43b74c","imgcolor":"231","hittag":"0","thumb_width":"500","thumb_height":"281","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"更多报告下载请关注众公号《报告未来》,数万份报告涵盖上千个行业,每日更新. 责 : 3.基于智能算法对于信息和人匹配的算法型分发(以今日头条为代表). 作为一种信息传播实践的新生产力量,算法型信息推荐(分发)技术实现了信息生产与传播范式的智","summarypc":"0","mf_id":"8286f4fe1c827903","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"搜狐网","painter_year":"","docidx":"41","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"],["95c435a20586d145-208298664a9952f8-d6dde712e8c180886d6fb7a7cb46adec","2280","1950","42","https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-155715568f56bc27499f53ae63234bc8","985","1386","36","https://i04piccdn.sogoucdn.com/3f8fdafe7dc42f50"],["8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","1266","1069","21","https://i02piccdn.sogoucdn.com/45cd399284b661b6"],["6011ab973c190aac-d52be326eb2121a7-7163bfa7069feda51799ca040d95c689","1241","787","51","https://i02piccdn.sogoucdn.com/631c992c16aa5a97"],["60d2f4fe0275d790-60de8deab87e73ea-6f53867d426f26ad9687df723c281fc7","499","393","34","https://i02piccdn.sogoucdn.com/0a33b821da2f188f"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://5b0988e595225.cdn.sohucs.com/images/20200315/5058e589795c42e0b0e088681f26f893.jpeg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"创作者在自身发展的过程中要不断探索内容付费、内容电商、广告合作等多种变","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1584278441","uri":""},{"type":-1,"cacheIndex":42,"title":"热搜内容一 榜 打尽 网易云音乐推出首个音乐热搜榜引关注","markedTitle":"热搜内容一 榜 打尽 网易云音乐推出首个音乐热搜榜引关注","url":null,"summary":null,"markedSummary":null,"size":"711332","date":null,"encoding":null,"time":0,"docid":"95c435a20586d145-208298664a9952f8-d6dde712e8c180886d6fb7a7cb46adec","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9","smallThumbUrl":"https://i01piccdn.sogoucdn.com/8c1bc1eba4192ea9_tiny","dataType":"pic","page_url":"http://tech.ifeng.com/c/7nRsbopyONr","pic_url":"http://e0.ifengimg.com/10/2019/0612/71BA49CD87CBEF85D5B8C77B8FFE341735CFFA0D_size694_w2280_h1950.png","similarUrlFirst":null,"similarUrlSecond":null,"width":"2280","height":"1950","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://e0.ifengimg.com/10/2019/0612/71BA49CD87CBEF85D5B8C77B8FFE341735CFFA0D_size694_w2280_h1950.png","https_convert":"0","imgkey1":"06740dff07ffffff","imgkey2":"971a97a15fd7b015","imgcolor":"231","hittag":"0","thumb_width":"292","thumb_height":"249","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"(对热搜词的简要描述有助于用户理解更多背景信息) 搜索行为是通过互联网获取信息及内容服务的最常见方式之一.对用户而言,热搜榜功能的推出,无疑可以帮助其更好地发现和分享音乐.而对于音乐人、视频达人、歌单达人等内容生产者而言,热搜榜不仅为优质作品的传播提供了全","summarypc":"0","mf_id":"8c1bc1eba4192ea9","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"凤凰科技","painter_year":"","docidx":"42","grpdocs":null,"grpdata":null,"simdata":[["60d2f4fe0275d790-60de8deab87e73ea-addf51f11ddcdab0b909f330d1a9c616","491","404","68","https://i01piccdn.sogoucdn.com/1664b7e3c32a1182"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-5b8f19cfa3b905c0349235a05c81b945","703","503","85","https://i01piccdn.sogoucdn.com/8fa0fcb7d2db916d"],["8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","1266","1069","21","https://i02piccdn.sogoucdn.com/45cd399284b661b6"],["9fc097932c179cba-33a593c239cbcf30-cab92b8f3937c0b62e9f0b76be141302","725","514","57","https://i03piccdn.sogoucdn.com/0f5ec0075fac5e59"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-83c7096460d4c347ee2ef00b3f45471d","702","504","58","https://i04piccdn.sogoucdn.com/baf366ea8a121746"],["6011ab973c190aac-277dee08d09bbfb7-d967e5cfc6cfcdee75f5ccb1486d186f","845","566","100","https://i03piccdn.sogoucdn.com/8cc95ad0b8caefa7"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://e0.ifengimg.com/10/2019/0612/71BA49CD87CBEF85D5B8C77B8FFE341735CFFA0D_size694_w2280_h1950.png","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"热搜内容一 榜 打尽 网易云音乐推出首个音乐热搜榜引关注","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1578048017","uri":""},{"type":-1,"cacheIndex":43,"title":"网站seo","markedTitle":"网站seo","url":null,"summary":null,"markedSummary":null,"size":"345281","date":null,"encoding":null,"time":0,"docid":"abe1eea3ca79fc28-c577ebdcb0f3dbcc-11cdf1e56859733c3ac17a1b19a1a2aa","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/9d2ad5718e1878d1","smallThumbUrl":"https://i01piccdn.sogoucdn.com/9d2ad5718e1878d1_tiny","dataType":"pic","page_url":"http://www.nmgcb.com.cn/flxx/1898/pro/2433.html","pic_url":"http://pics.wy-kc.com/upload/1898/admin/20190417/df61c12333e400717c37b368e055baa5.png","similarUrlFirst":null,"similarUrlSecond":null,"width":"500","height":"310","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://pics.wy-kc.com/upload/1898/admin/20190417/df61c12333e400717c37b368e055baa5.png","https_convert":"0","imgkey1":"02b421ff05b65ced","imgkey2":"aa1aa6cf5a63b4b3","imgcolor":"134","hittag":"0","thumb_width":"404","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"站工作室,站布局合适搜索引擎呢.站布局对咱们后期的是有很大的影响的,站布局的问题,站做的美丽就行,站的转化,那么怎样站呢.站布局合适搜索引擎.那么怎样能及时进入呢.就像你以为书店是好是坏一样,首要,这家书店必定有许多书,然后你能够进去快速找到你想要的书.","summarypc":"0","mf_id":"9d2ad5718e1878d1","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"内蒙古晨报","painter_year":"","docidx":"43","grpdocs":null,"grpdata":null,"simdata":[["31e992ba604be34c-3bab2b9f5234dfda-2b2dc9c45508c27eac07ea3d56017c10","521","350","89","https://i03piccdn.sogoucdn.com/37b4e3483b6fcd98"],["31e992ba604be34c-08fbb683bff01adf-93deb3608f6bc13967534c536834dd81","270","479","67","https://i02piccdn.sogoucdn.com/bf4ce0720aa4c7ce"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-d00f69b1c98567c4ab7d61fc6fe95e5a","500","347","52","https://i01piccdn.sogoucdn.com/60ad893c4620f826"],["1e764170ca558da7-4c0b8ccbd9b3f301-d2c166ae3eade003288bf48df013d5c5","446","450","118","https://i04piccdn.sogoucdn.com/34eecdb336094eb6"],["31e992ba604be34c-08fbb683bff01adf-9e3ad1f8756bf2a73fcd00dfb0bcdb61","500","889","119","https://i04piccdn.sogoucdn.com/de5915a94425c1a2"],["2526388c73e89af3-04e93708ecbd01f3-b7597f1fd294d5ca43e9752e82ac977c","284","284","82","https://i03piccdn.sogoucdn.com/66225f1bd932e9b1"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://pics.wy-kc.com/upload/1898/admin/20190417/df61c12333e400717c37b368e055baa5.png","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"网站seo","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1557051848","uri":""},{"type":-1,"cacheIndex":44,"title":"大脸猫seo 网站优化为什么很多人都选择改行 这件事你怎么看","markedTitle":"大脸猫seo 网站优化为什么很多人都选择改行 这件事你怎么看","url":null,"summary":null,"markedSummary":null,"size":"101972","date":null,"encoding":null,"time":0,"docid":"c04364e488f2aa52-f4ec3b791f7f0b18-d245da01a95e1d3c1b2307db53ecdb99","debugInfo":null,"thumbUrl":"https://i01piccdn.sogoucdn.com/3316656141a95694","smallThumbUrl":"https://i01piccdn.sogoucdn.com/3316656141a95694_tiny","dataType":"pic","page_url":"https://zhuanlan.zhihu.com/p/53949638","pic_url":"https://pic1.zhimg.com/v2-900d9dbad5b03ce4f3a2aa2d38b5aa9f_1200x500.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"650","height":"354","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"https://pic1.zhimg.com/v2-900d9dbad5b03ce4f3a2aa2d38b5aa9f_1200x500.jpg","https_convert":"1","imgkey1":"05cc173705daed36","imgkey2":"16eede016f85ab90","imgcolor":"134","hittag":"0","thumb_width":"460","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"选取宝贝报名 选择一个当季热销产品也是非常重要的,然后一个产品的销量和产品的评价也是非常重要的,特别的单个产品顾客反应的评价,都是老客户,都非常注重评语里面消费者发聩的情况,不好的评语会给单品转化带来很差的表现,我每次都会关注上淘金币活动平台的每次产品","summarypc":"0","mf_id":"3316656141a95694","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"知乎专栏","painter_year":"","docidx":"44","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-755becdefb2ac745bfa29dad9fb145e6","1024","768","53","https://i02piccdn.sogoucdn.com/a945908a7c644819"],["60d2f4fe0275d790-60de8deab87e73ea-8d2435905ae51addd627db715d73cf4a","299","349","87","https://i02piccdn.sogoucdn.com/51570b348c82aa07"],["c3f2965808c3b79c-abf073fd61dea6bb-97bba111df2647bbc0122fd27e8f7d85","1024","1024","46","https://i04piccdn.sogoucdn.com/85b82875bcc57c05"],["60d2f4fe0275d790-60de8deab87e73ea-5863c4d5aa925ac5b4131bac4dc79892","387","441","27","https://i02piccdn.sogoucdn.com/ac6e12e9954ef59e"],["9243fbcd523532c7-691bd291fb470e6c-8dfbef656df6018c619c3743b272653f","587","413","13","https://i01piccdn.sogoucdn.com/8ce28318a732c77a"],["179aa7c39428dfb8-d4c53e2b069317b8-d887667b6a3105738d7c19d5dabb8c0d","396","463","77","https://i04piccdn.sogoucdn.com/fdf64e2c13b69f6c"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"https://pic1.zhimg.com/v2-900d9dbad5b03ce4f3a2aa2d38b5aa9f_1200x500.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"大脸猫seo 网站优化为什么很多人都选择改行 这件事你怎么看","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1585121951","uri":""},{"type":-1,"cacheIndex":45,"title":"网站建设 网站设计 网站制作公司 网站seo优化 1680元全包","markedTitle":"网站建设 网站设计 网站制作公司 网站seo优化 1680元全包","url":null,"summary":null,"markedSummary":null,"size":"23863","date":null,"encoding":null,"time":0,"docid":"b4f7182c5244a487-e6df3715707fd1f5-a7a2104c3f543e8b22a23db105ab1b68","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/cea49fecca128b3a","smallThumbUrl":"https://i04piccdn.sogoucdn.com/cea49fecca128b3a_tiny","dataType":"pic","page_url":"http://www.mvidc.cn/wztg/081533141.html","pic_url":"http://img.mvidc.com/bdimages/upload1/20180717/6921531807340.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"800","height":"450","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://img.mvidc.com/bdimages/upload1/20180717/6921531807340.jpg","https_convert":"0","imgkey1":"0544186d02b76ead","imgkey2":"2fa639f2fa77c164","imgcolor":"134","hittag":"0","thumb_width":"446","thumb_height":"249","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"随着互联网用户的搜索习惯被普及,搜索引擎用户及需求不断的增加,很多中小型企业为了赢得搜索用户这块市场,不断使用各种 营销推广 手段,帮助企业获取客户源.因此,最节约成本的企业网站 推广操作方法已经备受关注.企业网站做SEO推广不仅可以宣传产品和","summarypc":"0","mf_id":"cea49fecca128b3a","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"","painter_year":"","docidx":"45","grpdocs":null,"grpdata":null,"simdata":[["abe1eea3ca79fc28-c577ebdcb0f3dbcc-755becdefb2ac745bfa29dad9fb145e6","1024","768","53","https://i02piccdn.sogoucdn.com/a945908a7c644819"],["e222e3d1e5293cd2-0af8e01dc791d1f6-b28183b8a4b0bb6d65df9430e7779091","500","345","7","https://i02piccdn.sogoucdn.com/e09e24e8d079cb9f"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-8a125d9f7c540e30747abc7158876027","500","333","116","https://i01piccdn.sogoucdn.com/42e4c8a4ad0fefee"],["c04364e488f2aa52-f4ec3b791f7f0b18-d245da01a95e1d3c1b2307db53ecdb99","1790","976","44","https://i01piccdn.sogoucdn.com/d192543cb0ee709c"],["e222e3d1e5293cd2-253a563d66980634-73d2522edf43c56915f04b50412921d5","500","345","63","https://i02piccdn.sogoucdn.com/05e70dbda4718945"],["cb0914269919bdc6-db2d8f437aa50a85-7d2008c1006fe8135e9bdcd3a800506f","532","476","101","https://i04piccdn.sogoucdn.com/9a73e82a442f4ff2"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://img.mvidc.com/bdimages/upload1/20180717/6921531807340.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"网站建设 网站设计 网站制作公司 网站seo优化 1680元全包","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1534363025","uri":""},{"type":-1,"cacheIndex":46,"title":"虎林seo优化网站","markedTitle":"虎林seo优化网站","url":null,"summary":null,"markedSummary":null,"size":"64325","date":null,"encoding":null,"time":0,"docid":"c3f2965808c3b79c-abf073fd61dea6bb-97bba111df2647bbc0122fd27e8f7d85","debugInfo":null,"thumbUrl":"https://i04piccdn.sogoucdn.com/c7922e0fdbc6d126","smallThumbUrl":"https://i04piccdn.sogoucdn.com/c7922e0fdbc6d126_tiny","dataType":"pic","page_url":"http://www.cpooo.com/products/912418661.html","pic_url":"http://images.cpooo.com/files/201909/16/m/1262961_1568618556.jpg","similarUrlFirst":null,"similarUrlSecond":null,"width":"640","height":"426","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://images.cpooo.com/files/201909/16/m/1262961_1568618556.jpg","https_convert":"0","imgkey1":"06580cef05deef77","imgkey2":"2d4f39ceda7ecb25","imgcolor":"134","hittag":"0","thumb_width":"376","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"所以想要进行大范围引流的中小企业,岳阳 网络 推广公司所推出的营销策略就一定不能错过,因为它不光是整合了企业的整体营销模式,还能更好的进行互补,更加的有利于增大曝光率,获得更多的用户引流效果. 湖南亿仁 在 这样不仅仅是省去了招募技术型","summarypc":"0","mf_id":"c7922e0fdbc6d126","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"产品网","painter_year":"","docidx":"46","grpdocs":null,"grpdata":null,"simdata":[["0e0d55ef93578e28-c56a20db2f0912f6-62dd738e6a3e2fa4206b7d8598c1dd06","1200","1064","109","https://i01piccdn.sogoucdn.com/45aecbc861c77a92"],["a6f1c6d011ec3eb8-ca076c8ce3342ed7-40e34bd6092c98594d5490b75e6accbb","485","563","84","https://i02piccdn.sogoucdn.com/7bc8533551dfc2d3"],["abe1eea3ca79fc28-c577ebdcb0f3dbcc-7bdd091e78adcdfc5566e1914ab7219b","1082","1561","32","https://i01piccdn.sogoucdn.com/40562c4b81bac5e6"],["699bf7cc633628ff-7652b36ba6945424-2ea3018d7816de99613ef3bb53762d59","500","404","20","https://i02piccdn.sogoucdn.com/d7c81b36f95ac85a"],["60d2f4fe0275d790-60de8deab87e73ea-e17add337725d2a3a2610ad20648235d","496","402","86","https://i04piccdn.sogoucdn.com/823a20002ea19ed7"],["8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","1266","1069","21","https://i02piccdn.sogoucdn.com/45cd399284b661b6"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://images.cpooo.com/files/201909/16/m/1262961_1568618556.jpg","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"虎林seo优化网站","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1568778954","uri":""},{"type":-1,"cacheIndex":47,"title":"2018网站seo优化系列之四:seo优......","markedTitle":"2018网站seo优化系列之四:seo优......","url":null,"summary":null,"markedSummary":null,"size":"545557","date":null,"encoding":null,"time":0,"docid":"e154002750821088-20370af6263487c0-d300e917a61071a5feb760681fb94b83","debugInfo":null,"thumbUrl":"https://i02piccdn.sogoucdn.com/cc6c46eb205bb11c","smallThumbUrl":"https://i02piccdn.sogoucdn.com/cc6c46eb205bb11c_tiny","dataType":"pic","page_url":"http://s.tiboo.cn/info/%E5%AD%98%E6%AC%BE/3/","pic_url":"http://p20.jxft.net/180919/542801_1651233371.png","similarUrlFirst":null,"similarUrlSecond":null,"width":"1219","height":"747","speedrank":null,"summarytype":"NormalSummary","ori_pic_url":"http://p20.jxft.net/180919/542801_1651233371.png","https_convert":"0","imgkey1":"04a00bff07b6dbb6","imgkey2":"c2981c1b858a10aa","imgcolor":"231","hittag":"0","thumb_width":"408","thumb_height":"250","anchor":null,"alt":null,"title2":null,"title1":"","surr1":null,"surr2":"首页后,价格为34元一天,从这前的预 存款 里面扣除. 在合同服务...微信号alai8683火炬章春来","summarypc":"0","mf_id":"cc6c46eb205bb11c","sohu_image":"","lastmodified":"","publishmodified":"","downloadPath":null,"downloadNum":null,"siteName":null,"anchor1":null,"grouppic":0,"biaoqing":0,"gifpic":0,"ch_site_name":"地宝网","painter_year":"","docidx":"47","grpdocs":null,"grpdata":null,"simdata":[["996e207fbabdc26c-4ad0d1f35585816c-6250df9711e803033de0478c37e7433f","590","383","111","https://i04piccdn.sogoucdn.com/e47138f81472117b"],["c286ca7ecc6f7a79-fd6afc44e6e3634f-7e45363e401f7f9a97063714694acd61","554","402","31","https://i03piccdn.sogoucdn.com/68ffa49e9e94116b"],["60d2f4fe0275d790-60de8deab87e73ea-823002633234b42bc2ce5d9d7b97ca19","488","399","79","https://i04piccdn.sogoucdn.com/610efdfbf9e08c3e"],["179aa7c39428dfb8-d4c53e2b069317b8-c9b08ecdb345d46f7c7ea78572384cc0","555","550","3","https://i04piccdn.sogoucdn.com/03e800c0d94b36e7"],["e222e3d1e5293cd2-560783330e9528a0-68d20923aefcb125da2cd859eeb7b645","500","345","97","https://i02piccdn.sogoucdn.com/75019641145ab6c5"],["d7036c9a17f5fda2-677210b4c6871c9a-025175a838fed4dbc0bda0b789952c67","600","400","17","https://i04piccdn.sogoucdn.com/7a8ee5c1af8f387a"]],"feeddata":null,"gifdata":null,"pptdata":null,"pic_url_noredirect":"http://p20.jxft.net/180919/542801_1651233371.png","base_url":"","groupid":null,"groupsize":0,"easter":false,"easterUrl":null,"oriTitle":"2018网站seo优化系列之四:seo优......","showSnapShot":false,"normalSummary":true,"fastSummary":false,"allSummary":false,"ldata":"1538671828","uri":""}]
     * totalItems : 8,587
     * hintWords : ["知道图片怎么搜索内容","如何用图片搜索内容","拍照上传搜索内容","搜索你感兴趣的内容","搜索国庆节手抄报内容","您搜索的内容不存在","图片搜索","百度图片搜索","国庆节手抄报内容","国庆中秋手抄报内容","国庆手抄报内容","中秋节手抄报内容","国庆英语手抄报的内容","国庆手抄报内容文字","英语国庆节手抄报内容","光盘行动手抄报内容"]
     */

    private String isForbiden;
    private String uuid;
    private String query;
    private boolean isClusterfilter;
    private boolean isTinyQcNull;
    private String globalQC;
    private String refineQuery;
    private String refineQueryEncode;
    private int maxEnd;
    private String tc;
    private String ts;
    private boolean showFiltered;
    private int isPornQuery;
    private String isQcResult;
    private int startIndex;
    private int itemsOnPage;
    private String painter;
    private int painter_doc_count;
    private String video;
    private String debug;
    private String tag;
    private String totalItems;
    private List<ItemsBean> items;
    private List<String> hintWords;

    public String getIsForbiden() {
        return isForbiden;
    }

    public void setIsForbiden(String isForbiden) {
        this.isForbiden = isForbiden;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isIsClusterfilter() {
        return isClusterfilter;
    }

    public void setIsClusterfilter(boolean isClusterfilter) {
        this.isClusterfilter = isClusterfilter;
    }

    public boolean isIsTinyQcNull() {
        return isTinyQcNull;
    }

    public void setIsTinyQcNull(boolean isTinyQcNull) {
        this.isTinyQcNull = isTinyQcNull;
    }

    public String getGlobalQC() {
        return globalQC;
    }

    public void setGlobalQC(String globalQC) {
        this.globalQC = globalQC;
    }

    public String getRefineQuery() {
        return refineQuery;
    }

    public void setRefineQuery(String refineQuery) {
        this.refineQuery = refineQuery;
    }

    public String getRefineQueryEncode() {
        return refineQueryEncode;
    }

    public void setRefineQueryEncode(String refineQueryEncode) {
        this.refineQueryEncode = refineQueryEncode;
    }

    public int getMaxEnd() {
        return maxEnd;
    }

    public void setMaxEnd(int maxEnd) {
        this.maxEnd = maxEnd;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public boolean isShowFiltered() {
        return showFiltered;
    }

    public void setShowFiltered(boolean showFiltered) {
        this.showFiltered = showFiltered;
    }

    public int getIsPornQuery() {
        return isPornQuery;
    }

    public void setIsPornQuery(int isPornQuery) {
        this.isPornQuery = isPornQuery;
    }

    public String getIsQcResult() {
        return isQcResult;
    }

    public void setIsQcResult(String isQcResult) {
        this.isQcResult = isQcResult;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getItemsOnPage() {
        return itemsOnPage;
    }

    public void setItemsOnPage(int itemsOnPage) {
        this.itemsOnPage = itemsOnPage;
    }

    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }

    public int getPainter_doc_count() {
        return painter_doc_count;
    }

    public void setPainter_doc_count(int painter_doc_count) {
        this.painter_doc_count = painter_doc_count;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public List<String> getHintWords() {
        return hintWords;
    }

    public void setHintWords(List<String> hintWords) {
        this.hintWords = hintWords;
    }

    public static class ItemsBean implements IBasePhotoInfo {
        /**
         * type : -1
         * cacheIndex : 0
         * title : 搜索内容很快
         * markedTitle : 搜索内容很快
         * url : null
         * summary : null
         * markedSummary : null
         * size : 30402
         * date : null
         * encoding : null
         * time : 0
         * docid : 04d4aea443b1b51e-68d7b51c89cfaf68-c267a9852e38a151cae25a590394ad31
         * debugInfo : null
         * thumbUrl : https://i02piccdn.sogoucdn.com/6b4973f90451f052
         * smallThumbUrl : https://i02piccdn.sogoucdn.com/6b4973f90451f052_tiny
         * dataType : pic
         * page_url : http://tech.hexun.com/2011-04-04/128480689.html
         * pic_url : http://img.hexun.com/2011-04-04/128480756.jpg
         * similarUrlFirst : null
         * similarUrlSecond : null
         * width : 500
         * height : 281
         * speedrank : null
         * summarytype : NormalSummary
         * ori_pic_url : http://img.hexun.com/2011-04-04/128480756.jpg
         * https_convert : 0
         * imgkey1 : 0648160100040201
         * imgkey2 : d58b09b197964b4d
         * imgcolor : 8
         * hittag : 0
         * thumb_width : 445
         * thumb_height : 250
         * anchor : null
         * alt : null
         * title2 : null
         * title1 :
         * surr1 : null
         * surr2 : 对下载进行管理 除了搜索到内容可以进行下载以外,我们还能够对下载内容进行管理,暂停以及删除等,这些都有遥控上面的对应的按键进行设置. 其他网络应用 在以前高清播放机上就常见到的天气、股票等跟人们生活息息相关的应用也在忆捷M900上得到了继承,另
         * summarypc : 0
         * mf_id : 6b4973f90451f052
         * sohu_image :
         * lastmodified :
         * publishmodified :
         * downloadPath : null
         * downloadNum : null
         * siteName : null
         * anchor1 : null
         * grouppic : 0
         * biaoqing : 0
         * gifpic : 0
         * ch_site_name : 和讯科技
         * painter_year :
         * docidx : 0
         * grpdocs : null
         * grpdata : null
         * simdata : [["266e6f0264a71f42-989a873bbeec7d4c-841b70b1f41ac0b778cb0ed1abeada79","347","432","88","https://i04piccdn.sogoucdn.com/b94575db0d25e5a3"],["9243fbcd523532c7-691bd291fb470e6c-8dfbef656df6018c619c3743b272653f","587","413","13","https://i01piccdn.sogoucdn.com/8ce28318a732c77a"],["c3f2965808c3b79c-abf073fd61dea6bb-97bba111df2647bbc0122fd27e8f7d85","1024","1024","46","https://i04piccdn.sogoucdn.com/85b82875bcc57c05"],["c04364e488f2aa52-f4ec3b791f7f0b18-d245da01a95e1d3c1b2307db53ecdb99","1790","976","44","https://i01piccdn.sogoucdn.com/d192543cb0ee709c"],["0e0d55ef93578e28-c56a20db2f0912f6-62dd738e6a3e2fa4206b7d8598c1dd06","1200","1064","109","https://i01piccdn.sogoucdn.com/45aecbc861c77a92"],["8829c4e9c9cb1543-0b7d025354eae085-31ec20c79bf8e62d2e4f4e8ba8baeb0f","1266","1069","21","https://i02piccdn.sogoucdn.com/45cd399284b661b6"]]
         * feeddata : null
         * gifdata : null
         * pptdata : null
         * pic_url_noredirect : http://img.hexun.com/2011-04-04/128480756.jpg
         * base_url :
         * groupid : null
         * groupsize : 0
         * easter : false
         * easterUrl : null
         * oriTitle : 搜索内容很快
         * showSnapShot : false
         * normalSummary : true
         * fastSummary : false
         * allSummary : false
         * ldata : 1515386284
         * uri :
         */

        private int type;
        private int cacheIndex;
        private String title;
        private String markedTitle;
        private String url;
        private String summary;
        private String markedSummary;
        private String size;
        private String date;
        private String encoding;
        private int time;
        private String docid;
        private String debugInfo;
        private String thumbUrl;
        private String smallThumbUrl;
        private String dataType;
        private String page_url;
        private String pic_url;
        private String similarUrlFirst;
        private String similarUrlSecond;
        private String width;
        private String height;
        private String speedrank;
        private String summarytype;
        private String ori_pic_url;
        private String https_convert;
        private String imgkey1;
        private String imgkey2;
        private String imgcolor;
        private String hittag;
        private String thumb_width;
        private String thumb_height;
        private String anchor;
        private String alt;
        private String title2;
        private String title1;
        private String surr1;
        private String surr2;
        private String summarypc;
        private String mf_id;
        private String sohu_image;
        private String lastmodified;
        private String publishmodified;
        private String downloadPath;
        private String downloadNum;
        private String siteName;
        private String anchor1;
        private int grouppic;
        private int biaoqing;
        private int gifpic;
        private String ch_site_name;
        private String painter_year;
        private String docidx;
        private String grpdocs;
        private String grpdata;
        private String feeddata;
        private String gifdata;
        private String pptdata;
        private String pic_url_noredirect;
        private String base_url;
        private String groupid;
        private int groupsize;
        private boolean easter;
        private String easterUrl;
        private String oriTitle;
        private boolean showSnapShot;
        private boolean normalSummary;
        private boolean fastSummary;
        private boolean allSummary;
        private String ldata;
        private String uri;
        private List<List<String>> simdata;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getCacheIndex() {
            return cacheIndex;
        }

        public void setCacheIndex(int cacheIndex) {
            this.cacheIndex = cacheIndex;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMarkedTitle() {
            return markedTitle;
        }

        public void setMarkedTitle(String markedTitle) {
            this.markedTitle = markedTitle;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getMarkedSummary() {
            return markedSummary;
        }

        public void setMarkedSummary(String markedSummary) {
            this.markedSummary = markedSummary;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getDebugInfo() {
            return debugInfo;
        }

        public void setDebugInfo(String debugInfo) {
            this.debugInfo = debugInfo;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public String getSmallThumbUrl() {
            return smallThumbUrl;
        }

        public void setSmallThumbUrl(String smallThumbUrl) {
            this.smallThumbUrl = smallThumbUrl;
        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getPage_url() {
            return page_url;
        }

        public void setPage_url(String page_url) {
            this.page_url = page_url;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getSimilarUrlFirst() {
            return similarUrlFirst;
        }

        public void setSimilarUrlFirst(String similarUrlFirst) {
            this.similarUrlFirst = similarUrlFirst;
        }

        public String getSimilarUrlSecond() {
            return similarUrlSecond;
        }

        public void setSimilarUrlSecond(String similarUrlSecond) {
            this.similarUrlSecond = similarUrlSecond;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSpeedrank() {
            return speedrank;
        }

        public void setSpeedrank(String speedrank) {
            this.speedrank = speedrank;
        }

        public String getSummarytype() {
            return summarytype;
        }

        public void setSummarytype(String summarytype) {
            this.summarytype = summarytype;
        }

        public String getOri_pic_url() {
            return ori_pic_url;
        }

        public void setOri_pic_url(String ori_pic_url) {
            this.ori_pic_url = ori_pic_url;
        }

        public String getHttps_convert() {
            return https_convert;
        }

        public void setHttps_convert(String https_convert) {
            this.https_convert = https_convert;
        }

        public String getImgkey1() {
            return imgkey1;
        }

        public void setImgkey1(String imgkey1) {
            this.imgkey1 = imgkey1;
        }

        public String getImgkey2() {
            return imgkey2;
        }

        public void setImgkey2(String imgkey2) {
            this.imgkey2 = imgkey2;
        }

        public String getImgcolor() {
            return imgcolor;
        }

        public void setImgcolor(String imgcolor) {
            this.imgcolor = imgcolor;
        }

        public String getHittag() {
            return hittag;
        }

        public void setHittag(String hittag) {
            this.hittag = hittag;
        }

        public String getThumb_width() {
            return thumb_width;
        }

        public void setThumb_width(String thumb_width) {
            this.thumb_width = thumb_width;
        }

        public String getThumb_height() {
            return thumb_height;
        }

        public void setThumb_height(String thumb_height) {
            this.thumb_height = thumb_height;
        }

        public String getAnchor() {
            return anchor;
        }

        public void setAnchor(String anchor) {
            this.anchor = anchor;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getTitle2() {
            return title2;
        }

        public void setTitle2(String title2) {
            this.title2 = title2;
        }

        public String getTitle1() {
            return title1;
        }

        public void setTitle1(String title1) {
            this.title1 = title1;
        }

        public String getSurr1() {
            return surr1;
        }

        public void setSurr1(String surr1) {
            this.surr1 = surr1;
        }

        public String getSurr2() {
            return surr2;
        }

        public void setSurr2(String surr2) {
            this.surr2 = surr2;
        }

        public String getSummarypc() {
            return summarypc;
        }

        public void setSummarypc(String summarypc) {
            this.summarypc = summarypc;
        }

        public String getMf_id() {
            return mf_id;
        }

        public void setMf_id(String mf_id) {
            this.mf_id = mf_id;
        }

        public String getSohu_image() {
            return sohu_image;
        }

        public void setSohu_image(String sohu_image) {
            this.sohu_image = sohu_image;
        }

        public String getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(String lastmodified) {
            this.lastmodified = lastmodified;
        }

        public String getPublishmodified() {
            return publishmodified;
        }

        public void setPublishmodified(String publishmodified) {
            this.publishmodified = publishmodified;
        }

        public String getDownloadPath() {
            return downloadPath;
        }

        public void setDownloadPath(String downloadPath) {
            this.downloadPath = downloadPath;
        }

        public String getDownloadNum() {
            return downloadNum;
        }

        public void setDownloadNum(String downloadNum) {
            this.downloadNum = downloadNum;
        }

        public String getSiteName() {
            return siteName;
        }

        public void setSiteName(String siteName) {
            this.siteName = siteName;
        }

        public String getAnchor1() {
            return anchor1;
        }

        public void setAnchor1(String anchor1) {
            this.anchor1 = anchor1;
        }

        public int getGrouppic() {
            return grouppic;
        }

        public void setGrouppic(int grouppic) {
            this.grouppic = grouppic;
        }

        public int getBiaoqing() {
            return biaoqing;
        }

        public void setBiaoqing(int biaoqing) {
            this.biaoqing = biaoqing;
        }

        public int getGifpic() {
            return gifpic;
        }

        public void setGifpic(int gifpic) {
            this.gifpic = gifpic;
        }

        public String getCh_site_name() {
            return ch_site_name;
        }

        public void setCh_site_name(String ch_site_name) {
            this.ch_site_name = ch_site_name;
        }

        public String getPainter_year() {
            return painter_year;
        }

        public void setPainter_year(String painter_year) {
            this.painter_year = painter_year;
        }

        public String getDocidx() {
            return docidx;
        }

        public void setDocidx(String docidx) {
            this.docidx = docidx;
        }

        public String getGrpdocs() {
            return grpdocs;
        }

        public void setGrpdocs(String grpdocs) {
            this.grpdocs = grpdocs;
        }

        public String getGrpdata() {
            return grpdata;
        }

        public void setGrpdata(String grpdata) {
            this.grpdata = grpdata;
        }

        public String getFeeddata() {
            return feeddata;
        }

        public void setFeeddata(String feeddata) {
            this.feeddata = feeddata;
        }

        public String getGifdata() {
            return gifdata;
        }

        public void setGifdata(String gifdata) {
            this.gifdata = gifdata;
        }

        public String getPptdata() {
            return pptdata;
        }

        public void setPptdata(String pptdata) {
            this.pptdata = pptdata;
        }

        public String getPic_url_noredirect() {
            return pic_url_noredirect;
        }

        public void setPic_url_noredirect(String pic_url_noredirect) {
            this.pic_url_noredirect = pic_url_noredirect;
        }

        public String getBase_url() {
            return base_url;
        }

        public void setBase_url(String base_url) {
            this.base_url = base_url;
        }

        public String getGroupid() {
            return groupid;
        }

        public void setGroupid(String groupid) {
            this.groupid = groupid;
        }

        public int getGroupsize() {
            return groupsize;
        }

        public void setGroupsize(int groupsize) {
            this.groupsize = groupsize;
        }

        public boolean isEaster() {
            return easter;
        }

        public void setEaster(boolean easter) {
            this.easter = easter;
        }

        public String getEasterUrl() {
            return easterUrl;
        }

        public void setEasterUrl(String easterUrl) {
            this.easterUrl = easterUrl;
        }

        public String getOriTitle() {
            return oriTitle;
        }

        public void setOriTitle(String oriTitle) {
            this.oriTitle = oriTitle;
        }

        public boolean isShowSnapShot() {
            return showSnapShot;
        }

        public void setShowSnapShot(boolean showSnapShot) {
            this.showSnapShot = showSnapShot;
        }

        public boolean isNormalSummary() {
            return normalSummary;
        }

        public void setNormalSummary(boolean normalSummary) {
            this.normalSummary = normalSummary;
        }

        public boolean isFastSummary() {
            return fastSummary;
        }

        public void setFastSummary(boolean fastSummary) {
            this.fastSummary = fastSummary;
        }

        public boolean isAllSummary() {
            return allSummary;
        }

        public void setAllSummary(boolean allSummary) {
            this.allSummary = allSummary;
        }

        public String getLdata() {
            return ldata;
        }

        public void setLdata(String ldata) {
            this.ldata = ldata;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public List<List<String>> getSimdata() {
            return simdata;
        }

        public void setSimdata(List<List<String>> simdata) {
            this.simdata = simdata;
        }

        @Override
        public String smallUrl() {
            return pic_url.isEmpty() ? smallThumbUrl : pic_url;
        }

        @Override
        public String bigUrl() {
            return ori_pic_url.isEmpty() ? thumbUrl : ori_pic_url;
        }

        @Override
        public String videoUrl() {
            return null;
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.type);
            dest.writeInt(this.cacheIndex);
            dest.writeString(this.title);
            dest.writeString(this.markedTitle);
            dest.writeString(this.url);
            dest.writeString(this.summary);
            dest.writeString(this.markedSummary);
            dest.writeString(this.size);
            dest.writeString(this.date);
            dest.writeString(this.encoding);
            dest.writeInt(this.time);
            dest.writeString(this.docid);
            dest.writeString(this.debugInfo);
            dest.writeString(this.thumbUrl);
            dest.writeString(this.smallThumbUrl);
            dest.writeString(this.dataType);
            dest.writeString(this.page_url);
            dest.writeString(this.pic_url);
            dest.writeString(this.similarUrlFirst);
            dest.writeString(this.similarUrlSecond);
            dest.writeString(this.width);
            dest.writeString(this.height);
            dest.writeString(this.speedrank);
            dest.writeString(this.summarytype);
            dest.writeString(this.ori_pic_url);
            dest.writeString(this.https_convert);
            dest.writeString(this.imgkey1);
            dest.writeString(this.imgkey2);
            dest.writeString(this.imgcolor);
            dest.writeString(this.hittag);
            dest.writeString(this.thumb_width);
            dest.writeString(this.thumb_height);
            dest.writeString(this.anchor);
            dest.writeString(this.alt);
            dest.writeString(this.title2);
            dest.writeString(this.title1);
            dest.writeString(this.surr1);
            dest.writeString(this.surr2);
            dest.writeString(this.summarypc);
            dest.writeString(this.mf_id);
            dest.writeString(this.sohu_image);
            dest.writeString(this.lastmodified);
            dest.writeString(this.publishmodified);
            dest.writeString(this.downloadPath);
            dest.writeString(this.downloadNum);
            dest.writeString(this.siteName);
            dest.writeString(this.anchor1);
            dest.writeInt(this.grouppic);
            dest.writeInt(this.biaoqing);
            dest.writeInt(this.gifpic);
            dest.writeString(this.ch_site_name);
            dest.writeString(this.painter_year);
            dest.writeString(this.docidx);
            dest.writeString(this.grpdocs);
            dest.writeString(this.grpdata);
            dest.writeString(this.feeddata);
            dest.writeString(this.gifdata);
            dest.writeString(this.pptdata);
            dest.writeString(this.pic_url_noredirect);
            dest.writeString(this.base_url);
            dest.writeString(this.groupid);
            dest.writeInt(this.groupsize);
            dest.writeByte(this.easter ? (byte) 1 : (byte) 0);
            dest.writeString(this.easterUrl);
            dest.writeString(this.oriTitle);
            dest.writeByte(this.showSnapShot ? (byte) 1 : (byte) 0);
            dest.writeByte(this.normalSummary ? (byte) 1 : (byte) 0);
            dest.writeByte(this.fastSummary ? (byte) 1 : (byte) 0);
            dest.writeByte(this.allSummary ? (byte) 1 : (byte) 0);
            dest.writeString(this.ldata);
            dest.writeString(this.uri);
            dest.writeList(this.simdata);
            dest.writeByte(this.isHeader ? (byte) 1 : (byte) 0);
        }

        public ItemsBean() {
        }

        @RequiresApi(api = Build.VERSION_CODES.Q)
        protected ItemsBean(Parcel in) {
            this.type = in.readInt();
            this.cacheIndex = in.readInt();
            this.title = in.readString();
            this.markedTitle = in.readString();
            this.url = in.readString();
            this.summary = in.readString();
            this.markedSummary = in.readString();
            this.size = in.readString();
            this.date = in.readString();
            this.encoding = in.readString();
            this.time = in.readInt();
            this.docid = in.readString();
            this.debugInfo = in.readString();
            this.thumbUrl = in.readString();
            this.smallThumbUrl = in.readString();
            this.dataType = in.readString();
            this.page_url = in.readString();
            this.pic_url = in.readString();
            this.similarUrlFirst = in.readString();
            this.similarUrlSecond = in.readString();
            this.width = in.readString();
            this.height = in.readString();
            this.speedrank = in.readString();
            this.summarytype = in.readString();
            this.ori_pic_url = in.readString();
            this.https_convert = in.readString();
            this.imgkey1 = in.readString();
            this.imgkey2 = in.readString();
            this.imgcolor = in.readString();
            this.hittag = in.readString();
            this.thumb_width = in.readString();
            this.thumb_height = in.readString();
            this.anchor = in.readString();
            this.alt = in.readString();
            this.title2 = in.readString();
            this.title1 = in.readString();
            this.surr1 = in.readString();
            this.surr2 = in.readString();
            this.summarypc = in.readString();
            this.mf_id = in.readString();
            this.sohu_image = in.readString();
            this.lastmodified = in.readString();
            this.publishmodified = in.readString();
            this.downloadPath = in.readString();
            this.downloadNum = in.readString();
            this.siteName = in.readString();
            this.anchor1 = in.readString();
            this.grouppic = in.readInt();
            this.biaoqing = in.readInt();
            this.gifpic = in.readInt();
            this.ch_site_name = in.readString();
            this.painter_year = in.readString();
            this.docidx = in.readString();
            this.grpdocs = in.readString();
            this.grpdata = in.readString();
            this.feeddata = in.readString();
            this.gifdata = in.readString();
            this.pptdata = in.readString();
            this.pic_url_noredirect = in.readString();
            this.base_url = in.readString();
            this.groupid = in.readString();
            this.groupsize = in.readInt();
            this.easter = in.readByte() != 0;
            this.easterUrl = in.readString();
            this.oriTitle = in.readString();
            this.showSnapShot = in.readByte() != 0;
            this.normalSummary = in.readByte() != 0;
            this.fastSummary = in.readByte() != 0;
            this.allSummary = in.readByte() != 0;
            this.ldata = in.readString();
            this.uri = in.readString();
            this.simdata = new ArrayList<List<String>>();
            in.readList(this.simdata, String.class.getClassLoader());
            this.isHeader = in.readByte() != 0;
        }

        public static final Creator<ItemsBean> CREATOR = new Creator<ItemsBean>() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public ItemsBean createFromParcel(Parcel source) {
                return new ItemsBean(source);
            }

            @Override
            public ItemsBean[] newArray(int size) {
                return new ItemsBean[size];
            }
        };

        boolean isHeader;

        public void setHeader(boolean header) {
            isHeader = header;
        }

        @Override
        public boolean isHeader() {
            return isHeader;
        }

        @Override
        public int getItemType() {
            return isHeader ? SectionEntity.HEADER_TYPE : SectionEntity.NORMAL_TYPE;
        }
    }
}
