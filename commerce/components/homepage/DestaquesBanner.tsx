import Link from 'next/link';
import EmblaCarousel from "./Banner/Carrosel";
import ItensDestaque from "./Banner/ItensDestaque";
export default function DestaquesBanner(){
    const SLIDE_COUNT = 5;
    const slides = Array.from(Array(SLIDE_COUNT).keys());
    return (
      <>
        <h2 className="txt_destaques">DESTAQUES</h2>
        <div className="banner">
          <article>
            <EmblaCarousel slides={slides} />
          </article>
          <ItensDestaque />
        </div>
        <style jsx>{`
          article {
            box-sizing: border-box;
            width: 50vw;
            height: 55vh;
            background: #fafafa;
            box-shadow: 0px 2px 5px rgba(0, 1, 2, 0.5);
            border-radius: 6px;
            justify-content: center;
            display: flex;
            flex-direction: row;
            padding: 1px 4vw;
            left: 20%;
            max-width: 100%;
            margin: 0 2vh;
          }
          .txt_destaques {
            margin-top: 2vw;
            margin-bottom: 2vh;
            text-decoration: none;
            font-style: bold;
            font-weight: 800;
            font-size: 28px;
            font-family: "quicksand";
            text-align: center;
          }
          .banner {
            display: flex;
            justify-content: center;
          }

          @media (max-width: 1350px) {
            article {
              width: 60vw;
              height: 56vh;
            }
          }
          @media (max-width: 700px) {
            .banner article {
              width: 84vw;
              height: 40vh;
              margin: 3vh 6vh;
            }
            .banner {
              display: inline-block;
            }
          }
        `}</style>
      </>
    );
}
