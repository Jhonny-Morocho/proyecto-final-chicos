/* 
const  CarritoCompras = new Vue({
    el: '#app',
    data: {
        inputCadena:"Jhonny",
    },
    //logica
    methods:{
        checkForm:function(e){
            e.preventDefault();
            console.log(inputCadena);
            axios.get('http://localhost:8080/myapp/api/'+inputCadena).then(response => {
                console.log("SOY EL GET CLIENTE "+response);
                },error=>{
                console.log(error);
            }) 
        },
  
    },
    //cuando se cargue la pagina cargar los datos del local sotorage
  
  }) */

  const app = new Vue({
    el: '#app',
    data: {
      inputCadena: "3^0;",
      url:"http://localhost:8080/myapp/api/",
      lexema:"",
      token:""
    },
    methods:{
    checkForm: function (e) {
        e.preventDefault();
        console.log(this.inputCadena);
        let cadenaBase64=btoa(this.inputCadena);
        console.log("cadena en 64 es "+cadenaBase64);
        //cliente
        axios.get(this.url+cadenaBase64)
        .then(response =>{
            console.log(response);
            this.lexema=response.data.lexema;
            this.token=response.data.tokens;
            console.log(this.lexema);
        },error=>{
            console.log(error);
        })
      }
    }
  })