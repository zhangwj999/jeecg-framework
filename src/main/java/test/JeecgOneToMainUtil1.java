package test;

import java.util.ArrayList;
import java.util.List;

import org.jeecgframework.codegenerate.generate.onetomany.CodeGenerateOneToMany;
import org.jeecgframework.codegenerate.pojo.onetomany.CodeParamEntity;
import org.jeecgframework.codegenerate.pojo.onetomany.SubTableEntity;


/**
 * 代码生成器入口【一对多】
 * @author 张代浩
 *
 */
public class JeecgOneToMainUtil1 {

	/**
	 * 一对多(父子表)数据模型，生成方法
	 * @param args
	 */
	public static void main(String[] args) {
		//第一步：设置主表
		CodeParamEntity codeParamEntityIn = new CodeParamEntity();
		codeParamEntityIn.setTableName("t_s_base_user");//主表[表名]
		codeParamEntityIn.setEntityName("TSUser");	 //主表[实体名]
		codeParamEntityIn.setEntityPackage("datapermit");	 //主表[包名]
		codeParamEntityIn.setFtlDescription("数据权限");	 //主表[描述]
		
		//第二步：设置子表集合
		List<SubTableEntity> subTabParamIn = new ArrayList<SubTableEntity>();
		//[1].子表一
		SubTableEntity po = new SubTableEntity();
		po.setTableName("t_s_user_datapermit");//子表[表名]
		po.setEntityName("UserDataPermitEntity");	 //子表[实体名]
		po.setEntityPackage("datapermit");			 //子表[包]
		po.setFtlDescription("数据权限明细");		 //子表[描述]
		//子表[外键:与主表关联外键]
		//说明：这里面的外键是子表的外键字段,非主表和子表的对应关系  GORDER_ID修改为ID
		po.setForeignKeys(new String[]{"ID","USER_ID"});
		subTabParamIn.add(po);
//		//[2].子表二
//		SubTableEntity po2 = new SubTableEntity();
//		po2.setTableName("jeecg_order_product");		//子表[表名]
//		po2.setEntityName("OrderProduct");			//子表[实体名]
//		po2.setEntityPackage("com"); 					//子表[包]
//		po2.setFtlDescription("订单产品明细");				//子表[描述]
//		//子表[外键:与主表关联外键]
//		//说明：这里面的外键是子表的外键字段,非主表和子表的对应关系      GORDER_ID修改为ID
//		po2.setForeignKeys(new String[]{"ID","GO_ORDER_CODE"});
//		subTabParamIn.add(po2);
		codeParamEntityIn.setSubTabParam(subTabParamIn);
		
		//第三步：一对多(父子表)数据模型,代码生成
		CodeGenerateOneToMany.oneToManyCreate(subTabParamIn, codeParamEntityIn);
	}
}
