<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="编号" prop="bianhao">
          <el-select  @change="bianhaoChange" v-model="ruleForm.bianhao" placeholder="请选择编号">
            <el-option
                v-for="(item,index) in bianhaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.bianhao" label="编号" prop="bianhao">
              <el-input v-model="ruleForm.bianhao" 
                placeholder="编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="比赛名称" prop="bisaimingcheng">
          <el-input v-model="ruleForm.bisaimingcheng" 
              placeholder="比赛名称" clearable  :readonly="ro.bisaimingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="比赛名称" prop="bisaimingcheng">
              <el-input v-model="ruleForm.bisaimingcheng" 
                placeholder="比赛名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="比赛项目" prop="bisaixiangmu">
          <el-input v-model="ruleForm.bisaixiangmu" 
              placeholder="比赛项目" clearable  :readonly="ro.bisaixiangmu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="比赛项目" prop="bisaixiangmu">
              <el-input v-model="ruleForm.bisaixiangmu" 
                placeholder="比赛项目" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="类型" prop="leixing">
          <el-select v-model="ruleForm.leixing" placeholder="请选择类型">
            <el-option
                v-for="(item,index) in leixingOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="类型" prop="leixing">
	      <el-input v-model="ruleForm.leixing"
                placeholder="类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="队员账号" prop="duiyuanzhanghao">
          <el-select  @change="duiyuanzhanghaoChange" v-model="ruleForm.duiyuanzhanghao" placeholder="请选择队员账号">
            <el-option
                v-for="(item,index) in duiyuanzhanghaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.duiyuanzhanghao" label="队员账号" prop="duiyuanzhanghao">
              <el-input v-model="ruleForm.duiyuanzhanghao" 
                placeholder="队员账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="队员姓名" prop="duiyuanxingming">
          <el-input v-model="ruleForm.duiyuanxingming" 
              placeholder="队员姓名" clearable  :readonly="ro.duiyuanxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="队员姓名" prop="duiyuanxingming">
              <el-input v-model="ruleForm.duiyuanxingming" 
                placeholder="队员姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="原号码编制" prop="yuanhaomabianzhi">
          <el-input v-model="ruleForm.yuanhaomabianzhi" 
              placeholder="原号码编制" clearable  :readonly="ro.yuanhaomabianzhi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="原号码编制" prop="yuanhaomabianzhi">
              <el-input v-model="ruleForm.yuanhaomabianzhi" 
                placeholder="原号码编制" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="新号码编制" prop="xinhaomabianzhi">
          <el-input v-model="ruleForm.xinhaomabianzhi" 
              placeholder="新号码编制" clearable  :readonly="ro.xinhaomabianzhi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="新号码编制" prop="xinhaomabianzhi">
              <el-input v-model="ruleForm.xinhaomabianzhi" 
                placeholder="新号码编制" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="原赛次" prop="yuansaici">
          <el-input v-model="ruleForm.yuansaici" 
              placeholder="原赛次" clearable  :readonly="ro.yuansaici"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="原赛次" prop="yuansaici">
              <el-input v-model="ruleForm.yuansaici" 
                placeholder="原赛次" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="新赛次" prop="xinsaici">
          <el-input v-model="ruleForm.xinsaici" 
              placeholder="新赛次" clearable  :readonly="ro.xinsaici"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="新赛次" prop="xinsaici">
              <el-input v-model="ruleForm.xinsaici" 
                placeholder="新赛次" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="原分组" prop="yuanfenzu">
          <el-input v-model="ruleForm.yuanfenzu" 
              placeholder="原分组" clearable  :readonly="ro.yuanfenzu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="原分组" prop="yuanfenzu">
              <el-input v-model="ruleForm.yuanfenzu" 
                placeholder="原分组" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="新分组" prop="xinfenzu">
          <el-input v-model="ruleForm.xinfenzu" 
              placeholder="新分组" clearable  :readonly="ro.xinfenzu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="新分组" prop="xinfenzu">
              <el-input v-model="ruleForm.xinfenzu" 
                placeholder="新分组" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="更改时间" prop="genggaishijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.genggaishijian" 
                type="datetime"
                placeholder="更改时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.genggaishijian" label="更改时间" prop="genggaishijian">
              <el-input v-model="ruleForm.genggaishijian" 
                placeholder="更改时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="备注" prop="beizhu">
          <el-input v-model="ruleForm.beizhu" 
              placeholder="备注" clearable  :readonly="ro.beizhu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="备注" prop="beizhu">
              <el-input v-model="ruleForm.beizhu" 
                placeholder="备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" 
              placeholder="账号" clearable  :readonly="ro.zhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="账号" prop="zhanghao">
              <el-input v-model="ruleForm.zhanghao" 
                placeholder="账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                              </el-row>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"rgba(251, 249, 249, 1)","dateIconFontSize":"14px","btnSaveBgColor":"#409EFF","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"#409EFF","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	bianhao : false,
	bisaimingcheng : false,
	bisaixiangmu : false,
	leixing : false,
	duiyuanzhanghao : false,
	duiyuanxingming : false,
	yuanhaomabianzhi : false,
	xinhaomabianzhi : false,
	yuansaici : false,
	xinsaici : false,
	yuanfenzu : false,
	xinfenzu : false,
	genggaishijian : false,
	beizhu : false,
	zhanghao : false,
	xingming : false,
      },
            ruleForm: {
                	        bianhao: '',
	                        	        bisaimingcheng: '',
	                        	        bisaixiangmu: '',
	                        	        leixing: '',
	                        	        duiyuanzhanghao: '',
	                        	        duiyuanxingming: '',
	                        	        yuanhaomabianzhi: '',
	                        	        xinhaomabianzhi: '',
	                        	        yuansaici: '',
	                        	        xinsaici: '',
	                        	        yuanfenzu: '',
	                        	        xinfenzu: '',
	                        	        genggaishijian: '',
	                        	        beizhu: '',
	                        	        zhanghao: '',
	                        	        xingming: '',
	                      },
                        bianhaoOptions: [],
                                                            leixingOptions: [],
                                duiyuanzhanghaoOptions: [],
                                                                                                                                                                              rules: {
                  bianhao: [
                                    	                                                              ],
                  bisaimingcheng: [
                                    	                                                              ],
                  bisaixiangmu: [
                                    	                                                              ],
                  leixing: [
                                    	                                                              ],
                  duiyuanzhanghao: [
                                    	                                                              ],
                  duiyuanxingming: [
                                    	                                                              ],
                  yuanhaomabianzhi: [
                                    	                                                              ],
                  xinhaomabianzhi: [
                                    	                                                              ],
                  yuansaici: [
                                    	                                                              ],
                  xinsaici: [
                                    	                                                              ],
                  yuanfenzu: [
                                    	                                                              ],
                  xinfenzu: [
                                    	                                                              ],
                  genggaishijian: [
                                    	                                                              ],
                  beizhu: [
                                    	                                                              ],
                  zhanghao: [
                                    	                                                              ],
                  xingming: [
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                                                                                      },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='bianhao'){
            this.ruleForm.bianhao = obj[o];
	    this.ro.bianhao = true;
            continue;
          }
	            	            if(o=='bisaimingcheng'){
            this.ruleForm.bisaimingcheng = obj[o];
	    this.ro.bisaimingcheng = true;
            continue;
          }
	            	            if(o=='bisaixiangmu'){
            this.ruleForm.bisaixiangmu = obj[o];
	    this.ro.bisaixiangmu = true;
            continue;
          }
	            	            if(o=='leixing'){
            this.ruleForm.leixing = obj[o];
	    this.ro.leixing = true;
            continue;
          }
	            	            if(o=='duiyuanzhanghao'){
            this.ruleForm.duiyuanzhanghao = obj[o];
	    this.ro.duiyuanzhanghao = true;
            continue;
          }
	            	            if(o=='duiyuanxingming'){
            this.ruleForm.duiyuanxingming = obj[o];
	    this.ro.duiyuanxingming = true;
            continue;
          }
	            	            if(o=='yuanhaomabianzhi'){
            this.ruleForm.yuanhaomabianzhi = obj[o];
	    this.ro.yuanhaomabianzhi = true;
            continue;
          }
	            	            if(o=='xinhaomabianzhi'){
            this.ruleForm.xinhaomabianzhi = obj[o];
	    this.ro.xinhaomabianzhi = true;
            continue;
          }
	            	            if(o=='yuansaici'){
            this.ruleForm.yuansaici = obj[o];
	    this.ro.yuansaici = true;
            continue;
          }
	            	            if(o=='xinsaici'){
            this.ruleForm.xinsaici = obj[o];
	    this.ro.xinsaici = true;
            continue;
          }
	            	            if(o=='yuanfenzu'){
            this.ruleForm.yuanfenzu = obj[o];
	    this.ro.yuanfenzu = true;
            continue;
          }
	            	            if(o=='xinfenzu'){
            this.ruleForm.xinfenzu = obj[o];
	    this.ro.xinfenzu = true;
            continue;
          }
	            	            if(o=='genggaishijian'){
            this.ruleForm.genggaishijian = obj[o];
	    this.ro.genggaishijian = true;
            continue;
          }
	            	            if(o=='beizhu'){
            this.ruleForm.beizhu = obj[o];
	    this.ro.beizhu = true;
            continue;
          }
	            	            if(o=='zhanghao'){
            this.ruleForm.zhanghao = obj[o];
	    this.ro.zhanghao = true;
            continue;
          }
	            	            if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
	    this.ro.xingming = true;
            continue;
          }
	                    }
                                                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                                                                                                                                                                                                                          		if(json.zhanghao!=''&&json.zhanghao){
              		this.ruleForm.zhanghao = json.zhanghao
		}
                                  		if(json.xingming!=''&&json.xingming){
              		this.ruleForm.xingming = json.xingming
		}
                              } else {
          this.$message.error(data.msg);
        }
      });
                                          this.$http({
              url: `option/bisaixinxi/bianhao`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.bianhaoOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
                                                                            this.leixingOptions = "改名,该项,增加".split(',')
                                        this.$http({
              url: `option/duiyuan/duiyuanzhanghao`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.duiyuanzhanghaoOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
                                                                                                                                                                                                                                  },
            // 下二随
    bianhaoChange () {
      this.$http({
        url: `follow/bisaixinxi/bianhao?columnValue=`+ this.ruleForm.bianhao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
                                                          if(data.data.bisaimingcheng){
                this.ruleForm.bisaimingcheng = data.data.bisaimingcheng
              }
                                                if(data.data.bisaixiangmu){
                this.ruleForm.bisaixiangmu = data.data.bisaixiangmu
              }
                                                                                            if(data.data.duiyuanxingming){
                this.ruleForm.duiyuanxingming = data.data.duiyuanxingming
              }
                                                                                                                                                                                                                                                          } else {
          this.$message.error(data.msg);
        }
      });
    },
                                        // 下二随
    duiyuanzhanghaoChange () {
      this.$http({
        url: `follow/duiyuan/duiyuanzhanghao?columnValue=`+ this.ruleForm.duiyuanzhanghao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
                                                          if(data.data.bisaimingcheng){
                this.ruleForm.bisaimingcheng = data.data.bisaimingcheng
              }
                                                if(data.data.bisaixiangmu){
                this.ruleForm.bisaixiangmu = data.data.bisaixiangmu
              }
                                                                                            if(data.data.duiyuanxingming){
                this.ruleForm.duiyuanxingming = data.data.duiyuanxingming
              }
                                                                                                                                                                                                                                                          } else {
          this.$message.error(data.msg);
        }
      });
    },
                                                                                                    // 多级联动参数
                                                                                                                                                                            info(id) {
      this.$http({
        url: `saizhongxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                                                    this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `saizhongxinxi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.saizhongxinxiCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.saizhongxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                                                                                                                                                                    	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
