import Link from "next/link";

export default function Categorias (){
       const itensCategoria = {
         categorias: [{
          subcategoria:"Paulistão",
          imagem:"/img/clubes-paulistas-removebg-preview.png",
          alt:""
         },
         {
          subcategoria:"Premier League", 
          imagem: "/img/premier-removebg-preview.png",
          alt: ""
         },
         {
          subcategoria:"NBA",
          imagem:"/img/NBA-vector-logos-636x480-removebg-preview.png",
          alt:""
         },
         {
          subcategoria:"La Liga Santander",
          imagem:"/img/logo-la-liga-1536-removebg-preview.png",
          alt:""
         }
          ],
       };
    return (
      <>
        <h2 className="txt_categorias">CATEGORIAS MAIS VENDIDAS</h2>
        <div className="itens_Categoria">
          {itensCategoria.categorias.map((categoria) => {
            return (
              // eslint-disable-next-line react/jsx-key
              <button className="card_categoria_banner">
                <a href="#">
                  <img
                    src={categoria.imagem}
                    alt="camisa liverpool"
                    className="img_categoria"
                  />
                  <p className="txt_item_categoria">{categoria.subcategoria}</p>
                </a>
              </button>
            );
          })}
        </div>
        <style jsx>{`
          .card_categoria_banner {
            width: 17vw;
            height: 29vh;
            margin: 14px;
            background: #fafafa;
            box-shadow: 0px 0px 5px;
            justify-content: space-between;
            display: inline-block;
            flex-direction: row;
            border-radius: 50%;
            margin: 3vw 1vw;
          }
          .txt_categorias {
            justify-content: center;
            text-decoration: none;
            font-style: normal;
            font-weight: bold;
            font-size: 28px;
            font-family: "quicksand";
            text-align: center;
            line-height: 50px;
            display: flex;
          }
          .itens_Categoria {
            display: flex;
            justify-content: center;
          }
          .img_categoria {
            width: 11vw;
            padding-top: 14px;
            margin: auto;
          }
          .txt_item_categoria {
            font-weight: 700;
            font-size: 18px;
            font-family: "quicksand";
            text-align: center;
            color: #333333;
            position: relative;
            bottom: -15%;
            display: flex;
            justify-content: center;
          }
          @media (max-width: 700px) {
            .card_categoria_banner {
              width: 74vw;
              height: 35vh;
              display: flex;
              justify-content: center;
              margin: 10px auto;
              margin-right: 30px;
            }
            .itens_Categoria {
              display: inherit;
            }
            a .img_categoria {
              height: 25vh;
              margin: auto;
              width: 68vw;
            }
          }
          @media (min-width: 1650px) {
            .card_categoria_banner {
              grid: auto-flow / 1fr 1fr 1fr 1fr;
            }
          }
          @media (max-width: 1360px) {
            .card_categoria_banner {
              height: 24vh;
              width: 17vw;
            }
            a .img_categoria {
              height: 14vh;
              width: 13vw;
              height: 14vh;
            }
            }
            .txt_item_categoria {
              bottom: -28%;
            }
          }
        `}</style>
      </>
    );
}
