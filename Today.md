# Memento
* Dubbo Test
    * limit ip
    * local test + publish cn
* Book Purchase
             
 # Plan
 * AM
 1. plan
 2. manufacture archi code
 3. manufacture archi code
 4. manufacture busi code
 5. manufacture busi code
 * MID
 1. adjust
 * PM
 1. manufacture review
 2. manufacture review
 3. manufacture archi code
 4. manufacture archi code
 5. manufacture busi code
 6. manufacture test
 7. manufacture test
 8. .net c# project
 9. .net c# project
 10. whole process
 * DELAY
 
 # Home
 1. spring architect
 2. ant interview
 3. springcloud real practice
 4. father list

# Learn

1107 test
1. limit find(product_id time areaCode)
2. limitSeller
3. prohibitexport
4. limitPrice

# Problem
* jekins multiple ip
* project multiple git/server/log

====

通用(删栏组合) 性能(批量，线程) 可扩展(删栏添加) 各过滤组件独立(删栏分离)

* 商品限价 
    
    商品 -> 限制(time, area, business, price(strategy))，rule -> 商品

* 设置

    获取限制信息（数据转换）
    修改限制信息
    获取基本信息（其他库）
    
======
    
    获取组合信息（基本查询 rpc调用 数据组合）
    修改限制数据（insertOrUpdate问题）

### 过滤重构
1. 移库
2. 接口改造
    
    out
    批量根据商品查询商品、商业、会员大区 -- 商品
    根据商品查询商品、商业 -- 商品
    根据商业查询会员大区 -- 商品
    查询price（确认） -- 商品
    根据原产品id查询商品id（查代码）--商品
    根据商品查询品号信息 -- 品规
    根据品号id查询商品 -- 品规
    批量根据品号id查询品号信息 -- 品规
    
    in
    我的品种列表交互接口 -- 规则
    
    查询商业（品）、product
3. 新品种模型
4. 规则重构
### 移动端品种搜索价格区间
1. 接口（限价）
### 直销门店协议
1. 前端调试

    * 异常
2. 厂家查看列表
3. 终段签订协议

