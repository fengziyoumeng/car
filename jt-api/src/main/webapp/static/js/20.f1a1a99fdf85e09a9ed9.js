webpackJsonp([20],{236:function(t,i,A){function n(t){A(338)}var e=A(33)(A(284),A(401),n,null,null);t.exports=e.exports},284:function(t,i,A){"use strict";Object.defineProperty(i,"__esModule",{value:!0}),i.default={data:function(){return{imgSrl:null}},methods:{init:function(){this.imgSrl=this.$route.query.imgUrl},back_index:function(){this.$router.push({path:"/index"})}},mounted:function(){this.init()}}},310:function(t,i,A){i=t.exports=A(227)(!0),i.push([t.i,".img{z-index:100;width:100%;height:100%;position:fixed;left:0;right:0;top:0;bottom:0}.img img:first-child{width:100%;height:100%;vertical-align:bottom}.img img:nth-child(2){width:.32rem;position:absolute;top:.4rem;right:.4rem}","",{version:3,sources:["C:/Users/Administrator/Desktop/记账完成/src/components/imgHtml.vue"],names:[],mappings:"AACA,KACE,YAAa,AACb,WAAY,AACZ,YAAa,AACb,eAAgB,AAChB,OAAQ,AACR,QAAS,AACT,MAAO,AACP,QAAU,CACX,AACD,qBACI,WAAY,AACZ,YAAa,AACb,qBAAuB,CAC1B,AACD,sBACI,aAAc,AACd,kBAAmB,AACnB,UAAY,AACZ,WAAc,CACjB",file:"imgHtml.vue",sourcesContent:["\n.img {\n  z-index: 100;\n  width: 100%;\n  height: 100%;\n  position: fixed;\n  left: 0;\n  right: 0;\n  top: 0;\n  bottom: 0;\n}\n.img img:nth-child(1) {\n    width: 100%;\n    height: 100%;\n    vertical-align: bottom;\n}\n.img img:nth-child(2) {\n    width: .32rem;\n    position: absolute;\n    top: 0.4rem;\n    right: 0.4rem;\n}\n"],sourceRoot:""}])},338:function(t,i,A){var n=A(310);"string"==typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);A(228)("04e4cff5",n,!0)},368:function(t,i){t.exports="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACYAAAAmCAYAAACoPemuAAAB1UlEQVRYR+3XMU7DMBQA0P+brV16hCwIVbZELwCkN+gNoEPPAcwwcAPKEThBO8JWpPyZcgMklLH6yFIqWVEa+9uW6BCvsZ2X/78dG+FEG56oC3qYNDN9xJJFTGtdAMB1WZYP0kld/ZVStwAwJqLnY32PplJrfQ8Ad8y8IqKF62W+zw0KEV+Y+Y2I5mKYGaCUWiHiTSqchfqsqqrY7XY/QbCUOAnKvNdrVVqRWxDRyjdth35SlDfMdNRab8xiYGYRrl5Ea2Z2ps/+YK+ImQF5no9Ho9EGES98cUqpKSIa1LerpppZ8IZJcQeUKRdmLohoKykBEcwXF4sS1Zj9tV1pTYEKhh2LXCpUFKwFt0TEx9Caiir+tuI1aR0Ohx+IeAYAFQBcSgu9bV5x8TcnqevtHQDOAeAXAK7+HVaj1og43e/3yyzLngCAmXkWiwuOmI06bLh18Zs/RDQuCNaGsv6LZrePxolhXaiUOBHMB5UK5w2ToJo4Zv6qqmrWdTAM3scSHHu2EpxXxBIeFL1xTpiFeiUic7sJatYp1gvXCUuFajliO3E+17eoSDXDG319q8/qRVmW5n6ZtE0mk/lgMMiDLrxJJQGTOYs/YM4kQ3qYNIx9xKQR+wN+36E225/7WwAAAABJRU5ErkJggg=="},401:function(t,i,A){t.exports={render:function(){var t=this,i=t.$createElement,n=t._self._c||i;return n("div",{staticClass:"img"},[n("img",{attrs:{src:t.imgSrl,alt:""}}),t._v(" "),n("img",{attrs:{src:A(368),alt:""},on:{click:function(i){t.back_index()}}})])},staticRenderFns:[]}}});
//# sourceMappingURL=20.f1a1a99fdf85e09a9ed9.js.map