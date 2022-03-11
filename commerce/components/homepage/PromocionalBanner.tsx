import Link from "next/link";

export default function PromocionalBanner(){
    return (
      <>
        <div className="banner"></div>
        <style jsx>{`
          .banner {
            margin: 10px 5vw;
            background-color: blue;
            width: 90%;
            height: 15vw;
            display:flex;
            justify-content: center;
          }
        `}</style>
      </>
    );
}
