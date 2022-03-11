import Link from "next/link";

export default function Categorias (){
       const itensCategoria = {
         categorias: [
           {
             categoria: "Brasileirão",
             imagem:
               "/img/29c778_310b49855c264744893563a3afb975e3_mv2-removebg-preview.png",
             alt:"Clubes Brasileiros"
           },
           {
             categoria: "Internacionais",
             imagem:
               "/img/e4fc8484b80d0f560d59215f45873ac2_tn-removebg-preview.png",
             alt:"Clubes Internacionais"
           },
           {
             categoria: "Basquete",
             imagem: "/img/logo-nba-20481.png",
             alt: "Categoria Basquete"
           },
           {
             categoria: "Corta-Vento",
             imagem:
               "/img/5d98765861f881cef02fb8a5c5253c7d-removebg-preview.png",
             alt:"Categoria Blusas Corta Vento"
           },
         ],
       };
    return (
      <>
        <h2 className="txt_categorias">CATEGORIAS</h2>
        <div className="itens_Categoria">
          {itensCategoria.categorias.map((categoria) => {
            return (
              // eslint-disable-next-line react/jsx-key
              <div className="card_categoria_banner">
                <img
                  src={categoria.imagem}
                  alt={categoria.alt}
                  className="img_categoria"
                />
                <button className="borda_item_categoria">
                  <a href="#">
                    <p className="txt_item_categoria">{categoria.categoria}</p>
                  </a>
                </button>
              </div>
            );
          })}
        </div>
        <style jsx>{`
          .card_categoria_banner {
            -webkit-align-items: center;
            -webkit-box-align: center;
            -ms-flex-align: center;
            align-items: center;
            box-sizing: border-box;
            width: 18vw;
            height: 24.3vh;
            background: #fafafa;
            box-shadow: 0px 2px 5px rgb(0 1 2 / 50%);
            border-radius: 6px;
            -webkit-box-pack: justify;
            -webkit-justify-content: space-between;
            justify-content: space-between;
            -webkit-flex-direction: row;
            -ms-flex-direction: row;
            flex-direction: row;
            padding: 1px 4vw;
            margin: 2vw 1vw;
            display: inline-block;
          }
          .txt_categorias {
            justify-content: center;
            margin-top: 2vw;
            margin-bottom: 2vh;
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
            width: 9vw;
            margin: 2px;
            align-items: center;
          }
          .txt_item_categoria {
            font-style: bold;
            font-weight: 800;
            font-size: 18px;
            font-family: "quicksand";
            text-align: center;
            color: #ffffff;
            text-decoration: none;
          }
          .borda_item_categoria {
            margin: auto;
            border-radius: 12px;
            box-shadow: 0px 0.5px 2px;
            background: #054293;
            height: 4vh;
            width: 11vw;
          }
          @media (min-width: 1650px) {
            .card_categoria_banner {
              grid: auto-flow / 1fr 1fr 1fr 1fr;
              padding: 1px 2vw;
              display: inherit;
            }
            .itens_Categoria {
              grid: auto-flow / 1fr 1fr 1fr 1fr;
            }
            a .img_categoria {
              width: 13vw;
            }
          }
          @media (max-width: 1360px) {
            .card_categoria_banner {
              padding: 1px 3vw;
            }
            .itens_Categoria {
            }
            .borda_item_categoria {
              width: 12vw;
            }
            .img_categoria {
              width: 12vw;
              height: 18vh;
            }
          }
          @media (max-width: 700px) {
            .card_categoria_banner {
              display: inherit;
              justify-content: center;
              width: 70vw;
              margin: 10px auto;
              margin-right: 30px;
              padding: 1px 2vw;
            }
            .itens_Categoria {
              display: inherit;
            }
            .borda_item_categoria {
              width: 36vw;
              margin-left: 50px;
            }
            .img_categoria {
              width: 38vw;
              margin-left: 50px;
            }
          }
        `}</style>
      </>
    );
}
