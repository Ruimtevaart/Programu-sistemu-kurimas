package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Owner;
import org.mybatis.cdi.Mapper;

@Mapper
public interface OwnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Sun May 08 13:33:14 EEST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Sun May 08 13:33:14 EEST 2022
     */
    int insert(Owner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Sun May 08 13:33:14 EEST 2022
     */
    Owner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Sun May 08 13:33:14 EEST 2022
     */
    List<Owner> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.OWNER
     *
     * @mbg.generated Sun May 08 13:33:14 EEST 2022
     */
    int updateByPrimaryKey(Owner record);
}