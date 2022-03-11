import Link from "next/link";

export default function Logo() {
  return (
    <>
      <Link href="/">
        <a className="logo">
          <img
            src="/img/logo1-removebg-preview.png"
            alt="Jotinha Store"
            className="cabecalho__logo"
          />
          <h4 className="text_logo">Jotinha Store</h4>
        </a>
      </Link>
      <style jsx>{`
        .logo {
          color: #ffffff;
          height: 150px;
          width: 300px;
          display: flex;
          text-decoration: none;
        }
        .cabecalho__logo {
          height: 140px;
          width: 150px;
        }
        .text_logo {
          color: #fffff;
          font-family: quicksand;
          font-style: normal;
          font-weight: 700;
          font-size: 18px;
          line-height: 150px;
          letter-spacing: 1.65px;
          border: none;
        }
      `}</style>
    </>
  );
}
