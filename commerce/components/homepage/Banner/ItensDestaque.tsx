import { title } from "process";

export default function ItensPromocao(){
   const itensDestaque= {
        itens: [
          {
            item:"Camisa PSG",
            imagem: "/img/20191230003127_4407995593_D-removebg-preview.png"
          },
          {
            item:"Camisa Manchester City",
            imagem:"/img/IMG_20180929_131025_313-removebg-preview.png"
          },
        ],
    }
    return (
      <>
        <div className="itens_Destaque">
          {itensDestaque.itens.map((itens, index) => {
            return (
              // eslint-disable-next-line react/jsx-key
              <article>
                <p className="nome_item_destaque">{itens.item}</p>
                <img
                  src={itens.imagem}
                  alt="camisa liverpool"
                  className="img_categoria"
                  key={index}
                />
                <button className="borda_item_categoria">
                  <a href="#">
                    <p className="txt_item_categoria">Confira</p>
                  </a>
                </button>
              </article>
            );
          })}
        </div>
        <style jsx>{`
          article {
            align-items: center;
            box-sizing: border-box;
            width: 18vw;
            height: 27.3vh;
            background: #fafafa;
            box-shadow: 0px 2px 5px rgba(0, 1, 2, 0.5);
            border-radius: 6px;
            justify-content: space-between;
            flex-direction: row;
            padding: 1px 2vw;
            margin-bottom: 1vh;
          }
          .img_categoria {
            width: 14vw;
            height: 19vh;
            padding-top: 6px;
          }
          .txt_item_categoria {
            font-style: bold;
            font-weight: 800;
            font-size: 18px;
            font-family: "quicksand";
            text-align: center;
            color: #ffffff;
          }
          .borda_item_categoria {
            border-radius: 12px;
            box-shadow: 0px 0.5px 2px;
            margin-left: 5vh;
            background: #054293;
            height: 4vh;
            width: 8vw;
            justify-content: center;
          }
          .nome_item_destaque {
            text-decoration: none;
            font-style: normal;
            font-weight: bold;
            font-size: 16px;
            font-family: "quicksand";
            justify-content: center;
            display: flex;
          }
          @media (min-width: 1650px) {
            .card_categoria_banner {
              padding: 1px 2vw;
            }
            .itens_Categoria {
            }
            .img_categoria {
              width: 15vw;
              margin: auto;
            }
            .nome_item_destaque {
            }
          }
          @media (max-width: 1360px) {
            .card_categoria_banner {
              padding: 1px 2vw;
            }
            .itens_Categoria {
            }
            .borda_item_categoria {
              width: 12vw;
              margin-left: 14px;
            }
            .img_categoria {
              width: 13vw;
              margin-left: 1vh;
              height: 17vh;
            }
            .itens_Destaque {
              margin-left: 2vh;
            }
            .nome_item_destaque {
            }
          }
          @media (max-width: 700px) {
            article {
              width: 70vw;
              display: inherit;
              margin-bottom: 3vh;
              height: 35.3vh;
            }
            .nome_item_destaque {
            }
            .borda_item_categoria {
              width: 30vw;
              margin-left: 50px;
            }
            .img_categoria {
              width: 55vw;
              height: 27vh;
            }
            .itens_Destaque {
              display: inherit;
              margin-left: 10vh;
            }
          }
        `}</style>
      </>
    );
}