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
![image](https://github.com/1124366901/test_springboot/assets/109325641/7a4141a5-1dfd-491e-9ed0-a91cde4d2ce3)

