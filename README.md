# test_springboot
功能：查询学生成绩By id
查询所有学生成绩 
添加学生成绩
  <!--    获取学生课程成绩-->
    <select id="getStuAch" resultMap="stu_course_ach">
        SELECT s.*, c.title, a.score
        FROM student s
                 LEFT JOIN achievement a on s.id = a.sid
                 LEFT JOIN course c on c.id = a.cid
        WHERE s.id = #{sid}
    </select>

    <!--    获取所有学生课程成绩-->
    <select id="getAllStuAch" resultMap="stu_course_ach">
        SELECT s.*, c.title, a.score
        FROM student s
                 LEFT JOIN achievement a on s.id = a.sid
                 LEFT JOIN course c on c.id = a.cid
    </select>
    <!--    添加学生成绩-->
    <insert id="insertScore" >
        insert into achievement (sid, cid, score)
        values
        <foreach collection="list" item="achievement" separator=",">
            (
            <if test="achievement.sid != null">
                #{achievement.sid},
            </if>
            <if test="achievement.cid != null">
                #{achievement.cid},
            </if>
            <if test="achievement.score != null">
                #{achievement.score}
            </if>
            )
        </foreach>
    </insert>

    ![image](https://github.com/1124366901/test_springboot/assets/109325641/f5c1da09-9c89-49bd-ac29-635e255c480f)


  
    
![image](https://github.com/1124366901/test_springboot/assets/109325641/85cbb830-a7ee-47b0-ad5c-9f6a64b15155)
![image](https://github.com/1124366901/test_springboot/assets/109325641/fb2fefbc-ffca-4d83-b206-e7d2879af8a7)

插入：
![image](https://github.com/1124366901/test_springboot/assets/109325641/b6bf0237-4c2b-4564-b410-f578f65be77a)

  前端页面的完成 增删改查功能完成
![image](https://github.com/1124366901/test_springboot/assets/109325641/be27c51e-9083-44f5-995d-f4939dfe0915)

学生修改成绩，下拉显示课程 并自动查询选中学生当前课程的成绩
![image](https://github.com/1124366901/test_springboot/assets/109325641/a5180e8b-b096-4b1e-92c6-91f5434654aa)


集群搭建以及测试：
![image](https://github.com/1124366901/test_springboot/assets/109325641/a5aa9ac0-d96f-4cd8-ad4c-5d8c6b19d0ed)


负载均衡，生产者提供服务，消费者使用服务
两个服务提供，两个不同的数据库
![image](https://github.com/1124366901/test_springboot/assets/109325641/7a4141a5-1dfd-491e-9ed0-a91cde4d2ce3)

![image](https://github.com/1124366901/test_springboot/assets/109325641/2932828c-cfd5-4be8-a0db-b96c72c01d24)


接口服务调用：
![image](https://github.com/1124366901/test_springboot/assets/109325641/2d079074-13d0-4d77-afbf-23b1e85b8ac8)
![image](https://github.com/1124366901/test_springboot/assets/109325641/852dacc5-4a25-4d4d-b399-576df7c72927)
![image](https://github.com/1124366901/test_springboot/assets/109325641/23d819c8-cf29-4597-b61d-7eb82d9e834d)




gateway网关注册
![image](https://github.com/1124366901/test_springboot/assets/109325641/e4d5722b-135c-438f-ad38-7df159d8ecfc)
![image](https://github.com/1124366901/test_springboot/assets/109325641/daaa8a13-8492-4bad-95cb-a1f51a4642a0)
![image](https://github.com/1124366901/test_springboot/assets/109325641/9382ddcc-233e-412d-83d5-7d83a75153e9)

springcloud config
![image](https://github.com/1124366901/test_springboot/assets/109325641/aebcbe9b-17b9-4de2-a978-93f6ab2753c5)

![image](https://github.com/1124366901/test_springboot/assets/109325641/bafbb0c0-391b-48e9-ac5b-083bcf8f8f8f)
