/* eslint-disable @next/next/no-img-element */
import { useState, useEffect, useCallback } from "react";
import {
    PrevButton,
    NextButton
} from "./ButtonCarrosel";
import useEmblaCarousel from "embla-carousel-react";

// import { mediaByIndex } from "../media";
export default function EmblaCarousel ({ slides }){
  const [viewportRef, embla] = useEmblaCarousel({ loop: false });
  const [prevBtnEnabled, setPrevBtnEnabled] = useState(false);
  const [nextBtnEnabled, setNextBtnEnabled] = useState(false);

  const scrollPrev = useCallback(() => embla && embla.scrollPrev(), [embla]);
  const scrollNext = useCallback(() => embla && embla.scrollNext(), [embla]);
  const onSelect = useCallback(() => {
    if (!embla) return;
    setPrevBtnEnabled(embla.canScrollPrev());
    setNextBtnEnabled(embla.canScrollNext());
  }, [embla]);

  useEffect(() => {
    if (!embla) return;
    embla.on("select", onSelect);
    onSelect();
  }, [embla, onSelect]);

  return (
<>
    <div className="embla">
      <div className="embla__viewport" ref={viewportRef}>
        <div className="embla__container">
          {slides.map((index) => (
            <div className="embla__slide" key={index}>
              <div className="embla__slide__inner">
                < img
                src = "/img/camisa-liverpool.png"
                alt = "camisa liverpool"
                className = "img_destaque"/>
              </div>
              <button className="item_destaque">
                <a href="#">
                  <p className = "txt_item_destaque">Camisa do Liverpool 250,00 R$</p>
                </a>
               </button> 
            </div>
          ))}
        </div>
      </div>
      <PrevButton onClick={scrollPrev} enabled={prevBtnEnabled} />
      <NextButton onClick={scrollNext} enabled={nextBtnEnabled} />
    </div>
    <style jsx> {`
    .embla {
        padding: 20px;
        max-width: 670px;
        margin-bottom:3vw;
        width: 49vh;
        left: 20%;
    }
    .embla__viewport {
        overflow: hidden;
        width: 100% ;
    }
    .embla__viewport.is-dragging {
        cursor: move;
        cursor: grab;
    }
    .embla__viewport.is-draggable {
        cursor: grabbing;
    }
    .embla__container{
        display: flex;
        user-select: none;
        -webkit-touch-callout: none;
        -khtml-user-select: none; 
        -webkit-tap-highlight-color: transparent;
        margin-left: -10px;
    }
    .embla__slide__inner {
      position: relative;
      overflow: hidden;
    }
    .embla__slide {
        position: relative;
        min-width: 100%;
        padding-left: 10px;
        padding-bottom: 10px;
    }
    .img_destaque{
        width:19vw;
        margin:auto;
        align-items: center;
        margin-left: 55px;
    }
    .txt_item_destaque{
      font-style: bold;
      font-weight: 800;
      font-size:18px;
      font-family:"quicksand";
      text-align: center;
      color:#ffffff;
      margin:auto;
    }
    .item_destaque{
      margin: auto;
      border-radius: 12px;
      box-shadow: 0px 0.5px 2px;
      background: #054293;
      height:5vh;
      width: 20vw;
      margin-left: 5vh;
      margin-top: 3vh;
    }
    @media (min-width: 400px) and (max-width: 701px){
      .embla__viewport{
        overflow: hidden;
        width: 100% ;
      }
     .img_destaque {
        width: 58vw;
        margin-left: 75px
      }
      .embla__slide .embla__slide__inner{
        width: 100vw;
        height: 28vh;
      }
      .item_destaque {
          height: 5vh;
          width: 76vw;
          margin-left: 85px;
      }
    }
    @media(min-width: 1361px) and (max-width: 1650px){
      .img_destaque{
        width: 24vw;
      }
      .item_destaque {
        width: 25vw;
      }
    }
    `}</style>
</>
  );
};

