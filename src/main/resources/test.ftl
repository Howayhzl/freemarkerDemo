<html>
<head>
 <meta charset="utf-8">
 <title>Freemarker入门小DEMO </title>
</head>
<body>
<#include "head.ftl">
<#--我是一个注释，不会输出-->
<!--html注释-->
${name},你好。${message}<br>
<#assign linkman="周先生">
联系人:${linkman}<br>
<#if success=true>
  您已通过实名认证
 <#else >
  您未通过实名认证
</#if><br>

--商品列表--<br>
<#list goodsList as goods >
   ${goods_index+1} 商品名称：${goods.name}  商品价格:${goods.price}<br>

</#list>
一共${goodsList?size}条记录<br>

<#assign text="{'bank':'工商银行','account':'123354654756766'}">
<#assign data=text?eval>
开户行：${data.bank} 账号:${data.account}<br>

当前日期：${today?date}<br>
当前时间：${today?time}<br>
当前日期+时间：${today?datetime}<br>

</body>
</html>
