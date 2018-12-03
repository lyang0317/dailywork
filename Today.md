# Memento
* Dubbo Test
    * limit ip
    * local test + publish cn
* Book Purchase
* C# code
             
 # Plan
 * AM
 1. plan
 2. shop database
 3. card deploy
 4. filter alter
 5. filter deploy
 * MID
 1. adjust
 * PM
 1. filter process add
 2. filter process test
 3. filter process test
 4. filter process test
 5. filter database alter
 6. filter interface test
 7. filter interface test
 8. filter interface test
 9. filter interface alter
 10. filter interface alter
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

### 过滤重构（周一）
1. 移库
2. 接口测试，改造，接口添加（命名区分, 参数分类，异常分类）
 
    * 代码合并
    * 基础商品接口商业获取 --商品
    * 基础商品接口与sql对比测试 --商品
    * rap
        * 查询价格方式
        * 进入商业列表改为调用品规商品
        * 商业列表分页讨论 
    * 接口整合
    * 数据库迁移
    * 新品种模型接入
    * 新业务形态整合
   
    out
    批量根据商品查询商品、商业、会员大区 -- 商品
    根据商品查询商品、商业 -- 商品
    根据商业查询会员大区 -- 商品
    查询price（确认） -- 商品
    根据原产品id查询商品id（查代码）--商品
    
    
    根据商品查询品号信息 -- 品规 --
    根据品号id查询商品 -- 品规
    批量根据品号id查询品号信息 -- 品规
    
    查询最低价
    
    in
    我的品种列表交互接口 -- 规则
    
    查询商业（品）、product 价格接口
3. 新品种模型
4. 规则重构

### 导入工具（周一）
1. 项目位置
2. 接口调用写库

### 会员注册（暂定周二）
1. 需求迭代情况
2. 流程梳理
3. 代码实现测试


